import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(15, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //List<Integer> numeros = Arrays.asList(7, 7, 7, 7, 7);
        d19(numeros);
    }

    public static void d1(List<Integer> num){
        num.stream().sorted().forEach(System.out::println);
    }

    public static void d2(List<Integer> num){
       System.out.println(num.stream().filter(t -> t%2==0).reduce(0,(a,b)-> a+b));
    }

    public static void d3(List<Integer> num){
        num.stream().filter(T -> T>=0).forEach(System.out::println);
    }

    public static void d4(List<Integer> num){
        List<Integer>resuList=num.stream().filter(T->T%2==0).collect(Collectors.toList());

        resuList.stream().forEach(System.out::println);
    }

    public static void d5(List<Integer> num){
       OptionalDouble  i= num.stream().filter(T->T>5).mapToDouble(Integer::doubleValue).average();
        i.stream().forEach(System.out::println);
    }

    public static void d6(List<Integer> num){
        num.stream().filter(T->T>=10).forEach(System.out::println);
    }

    public static void d7(List<Integer> num){
        num.stream().sorted((a,b)-> b.compareTo(a)).skip(1).findFirst().ifPresent(System.out::println);
    }

    public static void d8(List<Integer> num){
       int dig = num.stream().flatMap(T -> String.valueOf(T).chars().mapToObj(c -> c - '0'))
       .mapToInt(Integer::intValue).sum();
       System.out.println(dig);  
    }

    public static void d9(List<Integer> num){
        num.stream().distinct().forEach(System.out::println);
    }

    public static void d10(List<Integer> num){
        num.stream().filter(T->T%2!=0).filter(T-> T%3==0 || T%5==0 ).forEach(System.out::println);
    }

    public static void d11(List<Integer> num){
       int i = num.stream().mapToInt(T->T*T).sum();
       System.out.println(i); 
    }

    public static void d12(List<Integer> num){
       int i= num.stream().reduce(1,(a,b)->a*b); 
       System.out.println(i);
    }

    public static void d13(List<Integer> num){
        Map<Object, List<Integer>> i= num.stream().collect(Collectors.groupingBy(T->(T>5 && T<10)));
        System.out.println(i);
    }

    public static void d14(List<Integer> num){
        Integer pri = num.stream().filter(n -> {
            if (n < 2)
                return false;
            for (int i = 2; i < n; i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
            }).max(Comparator.naturalOrder()).orElse(null);
        System.out.println(pri);
    }
    
    public static void d15(List<Integer> num){
       boolean i= num.stream().anyMatch(T -> T<0);
       System.out.println(i);
    }  

    public static void d16(List<Integer> num){
        Map<Object, List<Integer>> i= num.stream().collect(Collectors.groupingBy(T->T%2==0));
        System.out.println(i);
    }

    public static void d17(List<Integer> num){
        num.stream().filter(n -> {
            if (n < 2)
                return false;
            for (int i = 2; i < n; i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
            }).forEach(System.out::println);
    }

    public static void d18(List<Integer> num){
        boolean i = num.stream().distinct().count()==1;
        System.out.println(i);
    }
    
    public static void d19(List<Integer> num){
       int i = num.stream().filter(T-> T%3==0 && T%5==0).mapToInt(Integer::intValue).sum();
        System.out.println(i);
    }
}
