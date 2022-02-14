package br.com.brvt;

import java.io.File;

import br.com.brvt.Util.ArquivoLer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


public class App extends Application {

	private Stage palco;
    private Text actSttArq;
	private Text actSttDir;
	private String arquivo;
	private String pastaDestino;

    @Override
    public void start(Stage stage) {
        stage.setTitle("Parseiro 1.0 - CNAB240BB Transferências");

		// Rótulo Seleciona o Arquivo
		Label lblArquivo = new Label("\nSelecione o Arquivo:");
		HBox lblArqHb = new HBox();
		lblArqHb.setAlignment(Pos.TOP_LEFT);
		lblArqHb.getChildren().add(lblArquivo);

		// btnArquivo - seleciona arquivo
		Button btnArquivo = new Button("Selecionar Arquivo");
		btnArquivo.setOnAction(new btnArquivoListener());
		HBox btnArquivoHB = new HBox(10);
		btnArquivoHB.setAlignment(Pos.TOP_LEFT);
		btnArquivoHB.getChildren().addAll(btnArquivo);

        // Status message text
		actSttArq = new Text();
		// actionStatus.setFont(Font.font("Calibri", FontWeight.NORMAL, 20));
		// actionStatus.setFill(Color.FIREBRICK);

		// Rótulo Seleciona o Diretório
		Label lblDiretorio = new Label("\nSelecione a Pasta de Destino:");
		HBox lblDirHb = new HBox();
		lblDirHb.setAlignment(Pos.TOP_LEFT);
		lblDirHb.getChildren().add(lblDiretorio);

		// btnDiretorio - seleciona Diretório
		Button btnDiretorio = new Button("Selecionar Arquivo");
		this.palco = stage;
		btnDiretorio.setOnAction(new btnDirListener());
		HBox btnDirHB = new HBox(10);
		btnDirHB.setAlignment(Pos.TOP_LEFT);
		btnDirHB.getChildren().addAll(btnDiretorio);

		// Status message text
		actSttDir = new Text();

		// btnComprantes - gera comprovantes
		Button btnComprovantes = new Button("Gerar Comprovantes");
		this.palco = stage;
		btnComprovantes.setOnAction(new btnCompListener());
		HBox btnCompHB = new HBox(10);
		btnCompHB.setAlignment(Pos.BOTTOM_RIGHT);
		btnCompHB.getChildren().addAll(btnComprovantes);

		// Vbox
		VBox vbox = new VBox(30);
		vbox.setPadding(new Insets(5, 5, 5, 5));
		vbox.getChildren().addAll(lblArqHb, btnArquivoHB, actSttArq, lblDirHb, btnDirHB, actSttDir, btnCompHB);

		// Scene
		Scene scene = new Scene(vbox, 500, 400); // w x h
		stage.setScene(scene);
		stage.show();

        
    }

    public static void main(String[] args) {
        launch();
    }

    private class btnArquivoListener implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent e) {
			exibirFileChooser();
		}
	}

	private void exibirFileChooser() {	
		FileChooser fileChooser = new FileChooser();
		File selectedFile = fileChooser.showOpenDialog(null);
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Arquivos de Retorno CANB240", "*.ret"));
		if (selectedFile != null) {
            actSttArq.setText("Arquivo Selecionado: " + selectedFile.getName());
			arquivo = selectedFile.getAbsolutePath();
		}
		else {
			actSttArq.setText("Nenhum Arquivo Selecionado");
			arquivo = "";
		}
	}

	private class btnDirListener implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent e) {
			exibirDirChooser();
		}
	}

	private void exibirDirChooser() {	
		DirectoryChooser dirChooser = new DirectoryChooser();
		File selectedDir = dirChooser.showDialog(palco);
        if (selectedDir != null) {
            actSttDir.setText("Pasta Selecionada: " + selectedDir.getAbsolutePath());
			pastaDestino = selectedDir.getAbsolutePath();
		}
		else {
			actSttDir.setText("Nenhuma Pasta Selecionada");
			pastaDestino = "";
		}
	}

	private class btnCompListener implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent e) {
            new ArquivoLer().leArquivo(arquivo, pastaDestino);
		}
	}
}
