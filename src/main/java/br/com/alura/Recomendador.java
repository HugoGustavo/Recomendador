package br.com.alura;

import java.io.File;
import java.io.IOException;

import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.model.DataModel;

public class Recomendador {

	public DataModel getModelosDeProdutos() throws IOException {
		return getModelo("dados.csv");	
	}

	public DataModel getModeloDeCursos() throws IOException {
		return getModelo("cursos2.csv");
	}
	
	private DataModel getModelo(String path) throws IOException {
        File file = new File("src/main/resource/" + path);
        return new FileDataModel(file);
    }

}
