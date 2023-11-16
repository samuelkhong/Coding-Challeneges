function disemvowel(str) {
    // inputs str
    // spaces? yes
    // special chars? yes
    // does case matter? Do we have return same case type? yes
    // empty strings? yes
    
    // output: str
    // no vowels [a,e, i , o , u]
    // do you want the string to retain spaces
    
    //examples disemvowel([Jo eats pizza!]) ... "J ts pzz!"
    //console.log(disemvowel... disemvowel)
    
    /*
      // declare a regular expression with var pattern
      // add flags to regular expression to continue throughout the string and to ignore case sensitivity
      // using the replace function on strings, input the regular expressiona and desired replacement characters
      // save the new string in and update the str variable
      return the updated string
    
    */
    
    var pattern = /[aeiou]/gi; // regular expression looks for a,e,i,o,u has global flag and case insensitive
    str = str.replace(pattern, ""); // replaces instances of the regular expression with a black space deleting that char
    
    return str;
  }