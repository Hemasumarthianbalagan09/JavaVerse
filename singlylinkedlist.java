



ArrayList<Integer>duplicate=new ArrayList<Integer>();
System.out.println("Duplicate elements in the list are: ");
int n = sc.nextInt();
System.out.println("Enter the elements of the list: ");
for(int i=0;i<n;i++){
    numbers.add(sc.nextint(2);
}
for(int i=0;i<numbers.size();i++){
    int count=0;
    for(int j=0;j<numbers.size();j++){
        if(numbers.get(i)==numbers.get(j)){
            count++;
        }
    }
    if(count>1 && !duplicate.contains(numbers.get(i))){
        duplicate.add(numbers.get(i));
    }
    system.out.println("Arraylist"+numbers);
    System.out.println("Elements occuring more than once:"duplicate);
    sc.close();
}

