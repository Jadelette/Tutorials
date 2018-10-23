public class SimpleMethod {

    public SimpleMethod() {

    }

    public void showSum(float x, float y, int count) {

        if(count < 1){
            return;
        }

        float sum = x + y;
        for (int i = 0; i < count; i++) {
            System.out.println(sum);
        }

    }

    public static void main(String[] args) {

           SimpleMethod myMethod = new SimpleMethod();

            myMethod.showSum(5, 6, 7);
        }

    }

