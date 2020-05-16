 import java.io.*;
 import java.math.*;
 import java.security.*;
 import java.text.*;
 import java.util.*;
 import java.util.concurrent.*;
 import java.util.function.*;
 import java.util.regex.*;
 import java.util.stream.*;
 import static java.util.stream.Collectors.joining;
 import static java.util.stream.Collectors.toList;

 class Result {

     /*
      * Complete the 'strangelyCompatible' function below.
      *
      * The function is expected to return an INTEGER.
      * The function accepts STRING_ARRAY students as parameter.
      */

     public static long strangelyCompatible(List<String> students)
     {
    	 long result = 0;
    	 int stringLength = students.get(0).length();//m
    	 int numberOfStrings = students.size();//n
    	 TreeMap<Long, Long> AllStringHash = new TreeMap<>(); 
    	 TreeMap<Long, Long> actualStringHash = new TreeMap<>();  
    	 long[] power = new long[stringLength];
    	 
    	 //calculate the powers required to calculate hash values
    	 power[0] = 1;
    	 for(int counter = 1; counter<stringLength; counter++)
    	 {
    		 power[counter] = power[counter-1] * 31;
    	 }
    	 
    	 int studentCounter = 0;
    	 for(String student : students)
    	 {
    		 long[] prehash = new long[stringLength];
    		 prehash[0] = student.charAt(0) - 'a' +1;
    		 for(int counter = 1; counter<stringLength; counter++)
    		 {
    			 prehash[counter] = ((student.charAt(counter)- 'a'+ 1)*power[counter]) + prehash[counter-1];
    		 }
    		 for(int counter = 0; counter<stringLength; counter++)
    		 {
    			 long hash = 0;
    			 //find all hash values formed by replacing each character with a special character.
    			 if(counter == 0)
    			 {
    				 hash = prehash[stringLength-1] - prehash[0] + 30;
    			 }
    			 else if(counter == stringLength-1)
    			 {
    				 hash = prehash[stringLength-2] + (30 * power[stringLength-1]);
    			 }
    			 else
    			 {
    				 hash = prehash[stringLength-1] - prehash[counter] + prehash[counter-1] + (30*power[counter]);
    			 }
    			 
    			 if(AllStringHash.containsKey(hash))
    			 {
    				long value = AllStringHash.get(hash);
    				result = result + value;
    				
    				value++;
    				AllStringHash.remove(hash);
    				AllStringHash.put(hash, value);
    			 }
    			 else
    			 {
    				 AllStringHash.put(hash,1l);
    			 }
    		 }
    		 if(actualStringHash.containsKey(prehash[stringLength-1]))
    		 {
    			 long value = actualStringHash.get(prehash[stringLength-1]);
    			 result = result - (stringLength * value);
 				
 				value++;
 				actualStringHash.remove(prehash[stringLength-1]);
 				actualStringHash.put(prehash[stringLength-1], value);
    			 
    		 }
    		 else
    			 actualStringHash.put(prehash[stringLength-1], 1l);
    		 studentCounter++;
    		 
    	 }
    	 
    	 return result;
     }
 }

 public class  CompatibleStrings  {
     public static void main(String[] args) throws IOException {
    	 

    	 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
         

         int n = Integer.parseInt(bufferedReader.readLine().trim());

         int m = Integer.parseInt(bufferedReader.readLine().trim());

         List<String> students = IntStream.range(0, n).mapToObj(i -> {
             try {
                 return bufferedReader.readLine();
             } catch (IOException ex) {
                 throw new RuntimeException(ex);
             }
         })
             .collect(toList());

         long result = Result.strangelyCompatible(students);

         System.out.println(String.valueOf(result));
         

         bufferedReader.close();
        
     }
 }
