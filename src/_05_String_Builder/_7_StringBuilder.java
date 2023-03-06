package _05_String_Builder;

public class _7_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);

        // get
        char ch  = sb.charAt(0);
        System.out.println(ch);

        //update
        sb.setCharAt(0 , 'd');
        System.out.println(sb);

        // insert
        sb.insert(2 , 'y');
        System.out.println(sb);

        // remove
        sb.deleteCharAt(2);
        System.out.println(sb);


        // append
        sb.append('g');
        System.out.println(sb);

        //length
        System.out.println(sb.length());
    }
}
