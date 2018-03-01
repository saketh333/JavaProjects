public String findLongestName(String [] names){
    int size = names.length;
    int longest = names[0].length();
    String longestName = names[0];
    for (int i = 1; i < size; i++){
        if (names[i].length() > longest){
            longest = names[i].length();
            longestName = names[i];
        }
        
    }


    return longestName;
}