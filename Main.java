public class Main {
    public static void main(String[] args) {
        // Задача. Работяга
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b);
        // Код не работал по причине деления на ноль, исправляется
        calc.println.accept(c);

        //Задача. Работяга
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorListener = System.out::println;
        Worker worker = new Worker(listener, errorListener);
        worker.start();
    }
}
