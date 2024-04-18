package practice;

public class SingleTonClass {
    private static  SingleTonClass singleTonClass = null;

    private SingleTonClass(){

    }

    public static SingleTonClass getInstance(){
        if (singleTonClass == null){
            singleTonClass = new SingleTonClass();
        }

        return  singleTonClass;
    }

    public static void main(String[] args) {
        SingleTonClass instance = SingleTonClass.getInstance();

        System.out.println(instance.hashCode());
    }
}
