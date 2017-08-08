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
                        // Criar pasta
                        File diretorio = Diretorio.getInstance();
                        diretorio.mkdir();
                        // Lendo Documento
			File readWord = new File("MCLI.doc");
			FileInputStream fis = new FileInputStream(readWord);
			BufferedInputStream bis = new BufferedInputStream(fis);
                        
                        //Criando Documento
                        String nomeLocatario[] = locatario.getNomeLocatario().split(" ");
                        
			File writeWord = new File("C:\\Users\\"+System.getProperty("user.name")+"\\Desktop\\Contratos\\Contrato-"+nomeLocatario[0]+".doc");
                        File writePdf = new File("C:\\Users\\"+System.getProperty("user.name")+"\\Desktop\\Contratos\\Contrato-"+nomeLocatario[0]+".pdf");
			HWPFDocument hwpf = new HWPFDocument(bis);
			r = hwpf.getRange();
			modificaCampos(locador, locatario,contrato); // Fazendo alterações no novo documento
			WordExtractor we = new WordExtractor(hwpf);
			//System.out.println(we.getText());
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
            r.replaceText("#ruaImovel#", "Rua "+contrato.getEndereco().getRua());
            r.replaceText("#numImovel#", Integer.toString(contrato.getEndereco().getNum()));
            r.replaceText("#bairroImovel#", contrato.getEndereco().getBairro());
            r.replaceText("#cepImovel#", contrato.getEndereco().getCep());
            r.replaceText("#cidadeImovel#", contrato.getEndereco().getCidade());
            r.replaceText("#estadoImovel#", contrato.getEndereco().getEstado());
            r.replaceText("#nomecidade#", contrato.getEndereco().getCidade());
            r.replaceText("#estado#", contrato.getEndereco().getEstado());
            //Info do Contrato
            String[] data = contrato.getDtInicio().split("/");
            r.replaceText("#dtInicio#", contrato.getDtInicio());
            r.replaceText("#dtFinal#", contrato.getDtTermino());
            r.replaceText("#valorAluguel#", String.valueOf(contrato.getValorAluguel()));
            r.replaceText("#valorAluguelExtenso#", valorPorExtenso(contrato.getValorAluguel()));
            r.replaceText("#dia#", data[0]);
            r.replaceText("#mes#", getMes(data[1]));
            r.replaceText("#ano#", data[2]);
            
            

        }
        
        //Algoritimo para gerar numero por extenso
        
        private static String valorPorExtenso(double vlr) {
        if (vlr == 0)
           return("zero");

        long inteiro = (long)Math.abs(vlr); // parte inteira do valor
        double resto = vlr - inteiro;       // parte fracionária do valor

        String vlrS = String.valueOf(inteiro);
        if (vlrS.length() > 15)
           return("Erro: valor superior a 999 trilhões.");

        String s = "", saux, vlrP;
        String centavos = String.valueOf((int)Math.round(resto * 100));

        String[] unidade = {"", "um", "dois", "três", "quatro", "cinco",
                 "seis", "sete", "oito", "nove", "dez", "onze",
                 "doze", "treze", "quatorze", "quinze", "dezesseis",
                 "dezessete", "dezoito", "dezenove"};
        String[] centena = {"", "cento", "duzentos", "trezentos",
                 "quatrocentos", "quinhentos", "seiscentos",
                 "setecentos", "oitocentos", "novecentos"};
        String[] dezena = {"", "", "vinte", "trinta", "quarenta", "cinquenta",
                 "sessenta", "setenta", "oitenta", "noventa"};
        String[] qualificaS = {"", "mil", "milhão", "bilhão", "trilhão"};
        String[] qualificaP = {"", "mil", "milhões", "bilhões", "trilhões"};

        // definindo o extenso da parte inteira do valor
        int n, unid, dez, cent, tam, i = 0;
        boolean umReal = false, tem = false;
        while (!vlrS.equals("0")) {
          tam = vlrS.length();
        // retira do valor a 1a. parte, 2a. parte, por exemplo, para 123456789:
        // 1a. parte = 789 (centena)
        // 2a. parte = 456 (mil)
        // 3a. parte = 123 (milhões)
          if (tam > 3) {
             vlrP = vlrS.substring(tam-3, tam);
             vlrS = vlrS.substring(0, tam-3);
          }
          else { // última parte do valor
            vlrP = vlrS;
            vlrS = "0";
          }
          if (!vlrP.equals("000")) {
             saux = "";
             if (vlrP.equals("100"))
                saux = "cem";
             else {
               n = Integer.parseInt(vlrP, 10);  // para n = 371, tem-se:
               cent = n / 100;                  // cent = 3 (centena trezentos)
               dez = (n % 100) / 10;            // dez  = 7 (dezena setenta)
               unid = (n % 100) % 10;           // unid = 1 (unidade um)
               if (cent != 0)
                  saux = centena[cent];
               if ((n % 100) <= 19) {
                  if (saux.length() != 0)
                     saux = saux + " e " + unidade[n % 100];
                  else saux = unidade[n % 100];
               }
               else {
                  if (saux.length() != 0)
                     saux = saux + " e " + dezena[dez];
                  else saux = dezena[dez];
                  if (unid != 0) {
                     if (saux.length() != 0)
                        saux = saux + " e " + unidade[unid];
                     else saux = unidade[unid];
                  }
               }
             }
             if (vlrP.equals("1") || vlrP.equals("001")) {
                if (i == 0) // 1a. parte do valor (um real)
                   umReal = true;
                else saux = saux + " " + qualificaS[i];
             }
             else if (i != 0)
                     saux = saux + " " + qualificaP[i];
             if (s.length() != 0)
                s = saux + ", " + s;
             else s = saux;
          }
          if (((i == 0) || (i == 1)) && s.length() != 0)
             tem = true; // tem centena ou mil no valor
          i = i + 1; // próximo qualificador: 1- mil, 2- milhão, 3- bilhão, ...
        }

        if (s.length() != 0) {
           if (umReal)
              s = s + " real";
           else if (tem)
                   s = s + " reais";
                else s = s + " de reais";
        }

    // definindo o extenso dos centavos do valor
        if (!centavos.equals("0")) { // valor com centavos
           if (s.length() != 0) // se não é valor somente com centavos
              s = s + " e ";
           if (centavos.equals("1"))
              s = s + "um centavo";
           else {
             n = Integer.parseInt(centavos, 10);
             if (n <= 19)
                s = s + unidade[n];
             else {             // para n = 37, tem-se:
               unid = n % 10;   // unid = 37 % 10 = 7 (unidade sete)
               dez = n / 10;    // dez  = 37 / 10 = 3 (dezena trinta)
               s = s + dezena[dez];
               if (unid != 0)
                  s = s + " e " + unidade[unid];
             }
             s = s + " centavos";
           }
        }
        return(s);
        }
        
        //Algoritimo que retorna o mes
        
        private static String getMes(String mes){
             if(Integer.parseInt(mes)==1){
                return "janeiro";
            }
            if(Integer.parseInt(mes)==2){
                return "fevereiro";
            }
            if(Integer.parseInt(mes)==3){
                return "março";
            }
            if(Integer.parseInt(mes)==4){
                return "abril";
            }
            if(Integer.parseInt(mes)==5){
                return "maio";
            }
            if(Integer.parseInt(mes)==6){
                return "junho";
            }
            if(Integer.parseInt(mes)==7){
                return "julho";
            }
            if(Integer.parseInt(mes)==8){
                return "agosto";
            }
            if(Integer.parseInt(mes)==9){
                return "setembro";
            }
            if(Integer.parseInt(mes)==10){
                return "outubro";
            }
            if(Integer.parseInt(mes)==11){
                return "novembro";
            }
            if(Integer.parseInt(mes)==12){
                return "dezembro";
            }
            return "Invalido";
        }

    
           
        
        
}
