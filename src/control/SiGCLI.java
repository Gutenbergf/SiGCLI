package control;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import model.Contrato;
import model.Locador;
import model.Locatario;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.hwpf.usermodel.Range;


public class SiGCLI {

	/**
	 * @param args
	 */
        static Range r;
        public static void processaDocumento(Locador locador,Locatario locatario, Contrato contrato){
            try {
                        // Lendo Documento
			File readWord = new File("C:\\Users\\Gutenberg\\Documents\\Contrato\\MCLI.doc");
			FileInputStream fis = new FileInputStream(readWord);
			BufferedInputStream bis = new BufferedInputStream(fis);
                        
                        //Criando Documento
			File writeWord = new File("C:\\Users\\Gutenberg\\Documents\\Contrato\\MCLI2.doc");
			HWPFDocument hwpf = new HWPFDocument(bis);
			r = hwpf.getRange();
			modificaCampos(locador, locatario,contrato); // Fazendo alterações no novo documento
			WordExtractor we = new WordExtractor(hwpf);
			System.out.println(we.getText());
			if(writeWord.exists())
				writeWord.delete();
			FileOutputStream fos = new FileOutputStream(writeWord);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			hwpf.write(bos);
			bos.flush();
			bos.close();
		} catch (Exception e) {
			e.printStackTrace();
		} catch (Throwable t) {
			t.printStackTrace();
		}
            
        }
        
        private static void modificaCampos(Locador locador,Locatario locatario,Contrato contrato){
            modificaLocador(locador);
            modificaLocatario(locatario);
            modificaContrato(contrato);
            
        }
        
        private static void modificaLocador(Locador locador){
            r.replaceText("#nomeLocador#", locador.getNomeLocador());
            r.replaceText("#nacionalidadeLocador#", locador.getNacionalidadeLocador());
            r.replaceText("#stCivilLocador#", locador.getStCivilLocado());
            r.replaceText("#profLocador#", locador.getProfLocador());
            r.replaceText("#rgLocador#", locador.getRgLocador());
            r.replaceText("#cpfLocador#", locador.getCpfLocador());
            
        }
        
        private static void modificaLocatario(Locatario locatario){
            r.replaceText("#nomeLocatario#", locatario.getNomeLocatario());
            r.replaceText("#nacionalidadeLocatario#", locatario.getNacionalidadeLocatario());
            r.replaceText("#stCivilLocatario#", locatario.getStCivilLocatario());
            r.replaceText("#profLocatario#", locatario.getProfLocatario());
            r.replaceText("#rgLocatario#", locatario.getRgLocatario());
            r.replaceText("#cpfLocatario#", locatario.getCpfLocatario());
        }
        
        private static void modificaContrato(Contrato contrato){
            // Endereço
            r.replaceText("#ruaImovel#", "Rua"+contrato.getEndereco().getRua());
            r.replaceText("#numImovel#", Integer.toString(contrato.getEndereco().getNum()));
            r.replaceText("#bairroImovel#", contrato.getEndereco().getBairro());
            r.replaceText("#cepImovel#", contrato.getEndereco().getCep());
            r.replaceText("#cidadeImovel#", contrato.getEndereco().getCidade());
            r.replaceText("#estadoImovel#", contrato.getEndereco().getEstado());
            //Info do Contrato	
            r.replaceText("#dtInicio#", contrato.getDtInicio());
            r.replaceText("#dtfim#", contrato.getDtTermino());
            r.replaceText("#valorAlguel#", String.valueOf(contrato.getValorAluguel()));

	
        }
}
