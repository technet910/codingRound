public class NthFibo{
     public static void main(String []args){
        System.out.println(nFib(6));
        System.out.println(rFib(6));
     }
 
// iterative     
public static int nFib(int n) {
    if (n < 0) return -1; 
    if (n == 0) return 0;
    int a = 1,b = 1;
    for(int i=3; i <= n; i++){
        int c = a + b;
        a = b;
        b = c;
    }
    return b;
}

//recursive
public static int rFib(int n) {
    if (n == 0) {
        return 0; 
    }else if(n == 1){
        return 1; 
    }else if(n > 1){
        return  rFib(n-1) +  rFib(n-2); 
    }else{
        return -1; 
    }
}

}
 
