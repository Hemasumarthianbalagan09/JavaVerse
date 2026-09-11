class vowel{
    public static void main(String[] a){
        String s = "welcome to java class";
        char[] c = s.toCharArray();
        System.out.println("The vowels are : ");
        for(int i=0;i<c.length;i++){
            if (c[i] == 'a'|| c[i] == 'e'|| c[i] == 'i'|| c[i] == 'o'|| c[i] == 'u'){
                System.out.printf(c[i] + " ");
            }
            
        }
    }
}