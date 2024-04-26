package provaestagio;

public class ProvaEstagio {

 
    public static void main(String[] args) {
        
            int n1=0,n2=1,soma=0,numero=13;
            
                do{
                soma=n1+n2;
                n1=n2;
                n2=soma;
                }while(soma!=numero && soma<numero);
                if(numero==soma){
                    System.out.println("Número pertence a sequência de Fibonacci.");
                } else{
                    System.out.println("Não percence a sequência.");
                }
            
            
            
    }
    
}
