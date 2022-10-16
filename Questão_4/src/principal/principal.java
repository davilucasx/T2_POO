package principal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;


public class principal {
    public static void main(String[] args) {
       int dia,mes,ano,hora,min;
       Calendar cal = Calendar.getInstance();
       LocalDateTime dateTime = LocalDateTime.now();
       String timeStamp = DateTimeFormatter.ofPattern("HH:mm").format(dateTime);
       dia = cal.get(Calendar.DAY_OF_MONTH);
       mes = cal.get(Calendar.MONTH) + 1 ;
       ano = cal.get(Calendar.YEAR);
       System.out.println("---------------------");
       System.out.println("Horário: "+timeStamp);
       System.out.printf("Data atual: " + dia + "/"+ mes + "/"+ ano + "\n");
       if(mes == 1) {
    	   System.out.println("O mês atual é janeiro");
       }  
       if(mes == 2) {
    	   System.out.println("O mês atual é fevereiro");
       }
       if(mes == 3) {
    	   System.out.println("O mês atual é março");
       }
       if(mes == 4) {
    	   System.out.println("O mês atual é abril");
       }
       if(mes ==5) {
    	   System.out.println("O mês atual é maio");
       }
       if(mes == 6) {
    	   System.out.println("O mês atual é junho");
       }
       if(mes == 7) {
    	   System.out.println("O mês atual é julho");
       }
       if(mes == 8) {
    	   System.out.println("O mês atual é agosto");
       }
       if(mes == 9) {
    	   System.out.println("O mês atual é setembro");
       }
       if(mes == 10) {
    	   System.out.println("O mês atual é outubro");
       }
       if(mes == 11) {
    	   System.out.println("O mês atual é novembro");
       }
       if(mes == 12) {
    	   System.out.println("O mês atual é dezembro");
       }
       System.out.println("---------------------");
    }
}