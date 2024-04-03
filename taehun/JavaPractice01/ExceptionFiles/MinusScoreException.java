package JavaPractice01.ExceptionFiles;

public class MinusScoreException extends RuntimeException{
    public MinusScoreException(){

    }
    public MinusScoreException(String message){
        super(message);
    }
}
