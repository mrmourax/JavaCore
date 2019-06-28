public class ArraysStringJava {
    public static void main(String[] args){
        String[] strings = new String[3];
        strings[0] = "Hello";
        strings[1] = "Bye";
        strings[2] = "Java";
        System.out.println(strings[2]);

        for(int i=0; i<strings.length;i++){
            System.out.println(strings[i]);
        }

        System.out.println();

        for(String string:strings){
            System.out.println(string);
        }

        int[] numbers1 = {1,2,3};
        int sum = 0;
        for(int i=0;i<numbers1.length;i++){
            sum = sum+numbers1[i];
        }
        System.out.println(sum);

        int value = 0;
        String s;
    }
}
