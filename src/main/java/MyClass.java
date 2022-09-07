public class MyClass {
    public static void main(String[] args) {
        String[] people = {"mike", "traore", "Nkaada", "mooney", "kang"};
        System.out.println(getLastIndex(people));
        System.out.println(getSecondToLastIndex(people));
        System.out.println(getFirstElement(people));
        System.out.println(getLastElement(people));
        System.out.println(getSecondToLastElement(people));

        int[] peopleBalance = {35, 40, 50, 60, 70, 5, 3, 81};
        System.out.println(getSum(peopleBalance));
        System.out.println(getAverage(peopleBalance));
        System.out.println(extractAllOddNumbers(peopleBalance));
        System.out.println(extractAllEvenNumbers(peopleBalance));
        System.out.println(contains(people, "Mustapha"));

    }

    //question 1
    public static int getLastIndex(String[] names) {
        return names.length - 1;
    }

    //question 2
    public static int getSecondToLastIndex(String[] names) {
        return getLastIndex(names) - 1;
    }

    //question 3
    public static String getFirstElement(String[] names) {
        return names[0];
    }

    //question 4
    public static String getLastElement(String[] names) {
        return names[getLastIndex(names)];
    }

    //question 5
    public static String getSecondToLastElement(String[] names) {
        return names[getLastIndex(names) - 1];
    }

    //question 6
    public static int getSum(int[] ints) {
        int sum = 0;
        int position = 0;
        while (position < ints.length - 1) {
            sum = sum + ints[position];
            position++;
        }

        return sum;
    }

    //question 7
    public static int getAverage(int[] ints) {
      int average = 0;
        average  = getSum(ints)/ints.length;
        return average;
    }
    //question 8
    public static String extractAllOddNumbers(int[] numbers) {
       int element = 0;
       int position = 0;
       String oddNumbers = " ";
       while(position <numbers.length){
           element = numbers[position];
           position++;
           if(element%2 != 0){
               oddNumbers =oddNumbers+ element +",";
           }
       }

        return oddNumbers;
    }

    //question 9
    public static String extractAllEvenNumbers(int[] numbers) {
        int element = 0;
        int position = 0;
        String evenNumbers = " ";
        while(position <numbers.length){
            element = numbers[position];
            position++;
            if(element% 2 == 0){
                evenNumbers =evenNumbers+ element +",";
            }
        }
        return evenNumbers;
    }
    //question 10
    public static boolean contains(String[] names, String element) {
        String name = null;
        int position = 0;
        boolean foundElement = false;
        while(position<names.length){
            name = names[position];
            position++;
            if(name.equals(element)){
                foundElement= true;
            }else{
                foundElement= false;
            }

        }
        return foundElement;
    }
}
