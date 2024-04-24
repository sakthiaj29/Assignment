package firstmonth0;

//Q: 2

public class FindSequenceID {
    
    public static String findSequence(String input) {
    	
        int n = input.length();
        int[] result = new int[n + 1];
        int min = 1, max = n + 1;
        
        for (int i = 0; i < n; i++) {
            if (input.charAt(i) == 'I') {
                result[i] = min++;
            } else {
                result[i] = max--;
            }
        }
        result[n] = min;
        
        StringBuilder sb = new StringBuilder();
        
        for (int num : result) {
            sb.append(num);
        }
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
      
    	String sequence="IIDDIDID";
    	
        System.out.println(sequence + " -> " + findSequence(sequence));
    }
}
