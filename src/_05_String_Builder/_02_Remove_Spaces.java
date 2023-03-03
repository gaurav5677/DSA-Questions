package _05_String_Builder;

public class _02_Remove_Spaces {
    public static void main(String[] args) {

        String s ="abc efg hij klm nop ";
        String[] parts = s.split(" ");
        for( int i = 0 ; i < parts.length ; i++){
            System.out.println(parts[i]);
        }
    }
}
