import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Integer[] arr={13,46,24,52,20,9};
     arr=BubbleSort.sort(arr);
        Arrays.stream(arr).forEach(x-> System.out.print(x+", "));
    }
}