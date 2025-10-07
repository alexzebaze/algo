

------ CODING GAME -----------

-----------------------------
Shadows of the Knight - Episode 1
https://github.com/emorejon/codingame-Shadows-of-the-Night-episode-1/blob/master/code.java
--------------------------------


--------------------------------------

//Sort map

public static Map<String, Integer> sortByValue(Map<String, Integer> map) {
    return map.entrySet().stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                    (oldValue, newValue) -> oldValue, LinkedHashMap::new));
}

-------------------------------------------
TEMPERATURE
class Solution {
    static double closestToZero(double[] ts) {

        if(ts == null || ts.length == 0)
            return 0;

        else{
            double closer = ts[0]; // par defaut la temperature la plus elevée
            for(int i = 0; i<ts.length; i++){
                
                if(Math.abs(ts[i]) <= Math.abs(closer)){
                    double lastcloser = closer;
                    closer = ts[i];
                    
                    if(ts[i] == -lastcloser)
                        closer = Math.abs(ts[i]);
                }
            }

            return closer;

        }
	}
}
-------------------------------------------
        //renvoie le nombre max que forme cette chaine
        // les elements de la chaine seront toujours des entier dans donnée dans l'ordre croissant

        String str = "12 3 45 6789";
        str = str.replace(" ","");
        String[] strArr = str.split("");

        Arrays.sort(strArr, Collections.reverseOrder());
        int number = Integer.valueOf(String.join("", strArr));
        System.out.println(number);
-------------------------------
    SUM EVENT DIGIT
    long number = 23947523;
        String[] strArr = String.valueOf(number).split("");
        long sum = 0;
        for (int i = 0; i < strArr.length ; i++) {
            if(Integer.valueOf(strArr[i])%2 == 0)
                sum += Integer.valueOf(strArr[i]);
        }
        System.out.println(sum);
-----------------
        ENCRYPTED COMMUNICATION

        StringBuffer stringBuffer = new StringBuffer("abcdefghijklmnopqrstuvwxyz");
        String alphabet = stringBuffer.reverse().toString();

        String[] alphabetArr = alphabet.split("");

        int[] letter = {18, 21, 14, 14, 11};
        String message = "";
        for (int num : letter){
            message += alphabetArr[num];
        }
        System.out.println(message);
-----------------------------------------------
    REPLACE SEQUENCE IN WORD CHAR TO NUMBER OCCURE
        String n = "l";
        String t = "Hello world";

        String[] tArr = t.split(" ");
        for (int j = 0; j < tArr.length; j++) {

            String word = tArr[j];
            String[] wordArr = word.split("");

            String n2 = "";
            for (int i = 0; i < wordArr.length; i++) {
                if(wordArr[i].equals(n))
                    n2 += n;
            }
            word = word.replace(n2, String.valueOf(n2.length()));
            tArr[j] = word;

        }
        System.out.println(String.join(" ", tArr));


----------------------------------------------------
    
    REMPLACE LE NOMBRE d occurrences consécutives de chaque lettre

        String plainText = "abcdefghijklmnopqrstuvwxyzzzzabcdefghijklmnopqrstuvwxyzzzz";

        String[] textArr = plainText.split("");

        int size = textArr.length;
        int i = 0;

        String result = "";
        while (i<size){

            String currentChar = textArr[i];
            int countChar = 0;
            for (int j = i; j < size ; j++) {
                if(textArr[j].equals(currentChar)){
                    countChar++;
                    i++;
                }
                else
                    break;
            }
            result += countChar+currentChar;

        }

        System.out.println(result);
        === OU BIEN ===

        int size = plainText.length();
        int i = 0;

        String result = "";
        while (i<size){

            char currentChar = plainText.charAt(i);
            int countChar = 0;
            for (int j = i; j < size ; j++) {
                if(plainText.charAt(j) == currentChar){
                    countChar++;
                    i++;
                }
                else
                    break;
            }
            result += countChar+String.valueOf(currentChar);
        }
        System.out.println(result);


---------------------------------------------------------
    VERIFIER SI UN TEXT EST UN PANGRAMME

    String[] alphabet = "abcdefghijklmnopqrstuvwxyz".split("");
        boolean result = true;
        S = S.toLowerCase();
        for(int i =0; i<alphabet.length; i++){
            if(!S.contains(alphabet[i]))
                result = false;

        } 

        System.out.println(result);

------------------------------
        CHAINE AVEC LES VALEUR à LA POSITION INVERSE DE L ALPHABET

        String word = "alex";
        String[] wordArr = word.split("");

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder stringBuilder = new StringBuilder(alphabet);
        String alphabetReverse = stringBuilder.reverse().toString();

        String result = "";
        for (int i = 0; i < wordArr.length; i++) {
            int index = alphabet.indexOf(wordArr[i]);
            result += alphabetReverse.substring(index, index+1);
        }

        System.out.println(result);

------------------- 
    MIDDLE VALUE OF SEQUENCE OF NUMBER

         int X = in.nextInt();
            int Y = in.nextInt();
            int Z = in.nextInt();
            
            int[] tab = {1,4,6};
            Arrays.sort(tab);
            System.out.println(tab[1]);
-------------------
    TRANSFORM TEXT USUALY FORMULE
    String f = "Xxxx, xx.";
        String s = "samejr";
        String[] formArr = f.split("");
        String[] sArr = s.split("");

        String result = "";
        int j = 0;
        for (int i =0; i<formArr.length; i++){
            if(formArr[i].equals("X"))
                result += sArr[j++].toUpperCase();
            else if(formArr[i].equals("x"))
                result += sArr[j++];
            else
                result += formArr[i];
        }


-------------------------------------
    
    NOMBRE OCCURENCE SUBSTRING IN STRING

        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        String text = in.nextLine();

        S = S.toLowerCase();
        text = text.toLowerCase();

        String[] textArr = text.split(" ");
        List<String> list = Arrays.asList(textArr);

        int count = 0;
        for(int i = 0; i<textArr.length; i++){
            if(textArr[i].contains(S))
                count++;
        }


        -------------------------------------------

        ENCRYPTED MATRIX TEXT

        String string = "CiaonmdGe";
        int size = (int)Math.sqrt(string.length());

        String[][] matrix = new String[size][size];
        //String[] matrix = new String[size];
        int j = 0;
        for (int i = 0; i <size ; i++) {
            matrix[i] = string.substring(j, j = j+size).split("");
            //matrix[i] = string.substring(j, j = j+size);
        }

        String str = "";
        for (int i = 0; i < size ; i++) {
            for (int k = 0; k < size; k++) {
                str += matrix[k][i];
                //str += matrix[k].substring(i, i+1);
            }
        }

        System.out.println((str));

-------------------------------------------
    
    COMMANDE ROBOT DEPLACEMENT
        String orders = "up up right down left";
        String[] ordersArr = orders.split(" ");

        String result = "";

        int count = 0;
        for (int i = 0; i < ordersArr.length; i = i+count) {
            String word = ordersArr[i];
            count = 0;
            for (int j = i; j < ordersArr.length; j++) {
                if(ordersArr[j].equals(ordersArr[i])){
                    count++;
                }
                else break;
            }
            if(count > 1)
                result += word+count;
            else
                result += word;
        }
        result = result.replace("up", "^");
        result = result.replace("right", ">");
        result = result.replace("left", "<");
        result = result.replace("down", "v");
        System.out.println(result);
 -------------------------------------------------------
    NUMBER HIGH JUMP AND LOW JUMP
 int[] TEXT = new int[]{4,7,2,3,3,4,7,2,3,3};

        int up = 0;
        int down = 0;

        int currentVal = 0;
        for (int i = 0; i <TEXT.length ; i++) {
            if(i>=1){
                if(TEXT[i] > currentVal)
                    up++;
                else if(TEXT[i] < currentVal)
                    down++;
            }
            currentVal = TEXT[i];
        }
        System.out.println(up+" "+down);


----------------------------------------
    
    TRIER UN TABLEAU PAR ORDRE CROISSANT

    int[] tab = {-1, 4, 7, 9, 5, 3};

    for (int i = 0; i < tab.length; i++) {
        int max = tab[i];
        int indexMax = i;
        for (int j = i; j < tab.length ; j++) {
            if(tab[j] > max) {
                max = tab[j];
                indexMax = j;
            }
        }
        int permute = tab[i];
        tab[i] = tab[indexMax];
        tab[indexMax] = permute;
    }
    return tab;
-----------------------------------

        RECUPERE L INDEX DES DEUX PLUS GRANDE VALEUR DU TABLEAU

        int[] tab = {-1, 4, 7, 9, 5, 3};
        //int[] result = new int[2];

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i<2 ;  i++) {
            int max = 0;
            int index = 0;
            for (int j = 0; j < tab.length ; j++ ) {
                if(tab[j] > max && !list.contains(j)){
                    max = tab[j];
                    index = j;
                }
            }
            //result[i] = index;
            list.add(index);
        }

        System.out.println(Arrays.toString(list.toArray()));
        //System.out.println(Arrays.toString(result));


---------------------------------------------


      String result = "";
      if(width*height*length >= 1000000 || (width >= 150 || height >= 150 || length >= 150) )
          isEncomb = true;

      if(masse >= 20)
          isLourd = true;

      if(isEncomb && isLourd)
        result = "REJECTED";
      else if(isEncomb || isLourd)
          result = "SPECIAL";
      else if(!isEncomb && !isLourd)
          result = "STANDARD";

      System.out.println(result);



--------------------------------------------

//La méthode reshape(n, str) retourne la chaine str sans les espaces et formatée en lignes de n
//caractères maximum

public static String reshape(int n, String str){
    str = str.replace(" ", "");

    int nbrLine = (int)Math.ceil((double)str.length()/n);
    String[] result = new String[nbrLine];

    int saut = 0;
    for (int i = 0; i < nbrLine  ; i++) {
        if(saut+n > str.length())
            result[i] = str.substring(saut);
        else
            result[i] = str.substring(saut, saut = saut+n);
    }
    return  String.join("\n", result);
}

public static String reshape(int n, String str) {
    String strWithoutEspace=str.replace(" ", "");
    String result="";
    int compteur=0;
    for(int i=0;i<strWithoutEspace.length();i++){
        compteur++;
        result+=strWithoutEspace.charAt(i);
        if(compteur==n){
            compteur=0;
            result+="\n";
        }
    }
}


---------------------------------------

function calc(array, n1, n2){
    var sum = 0;
    for(var i= 0; i< array.length; i++){
        if(i >= n1 && i<= n2)
            sum += array[i];
    }
    console.log(sum);
    console.log('-------------');
    console.log(array.filter((val, index) => index >= n1 && index <= n2 ).reduce((a,b)=>a+b));
}


-----------------------------------------------
//L'index du couple de numbre dont la somme est egale à 
class Solution {
   public int[] twoSum(int[] nums, int target) {
         Map<Integer, Integer> complement = new HashMap<>();
         for(int i = 0; i < nums.length; i++){
             if( complement.containsKey(target - nums[i]) ) {
                 return new int[] { complement.get(target - nums[i]), i};
             }
             complement.put(nums[i], i);
         }
         return new int[] {};
    }
}

==== ou ====

static int[] getCouple(int[] nums, int target){

    List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

    for(Integer num : numsList){
        if(numsList.contains(target-(int)num))
            return new int[] {numsList.indexOf(target-(int)num), numsList.indexOf(num)};
    }

    return new int[]{};
}

----------------------

// Les trois premieres plus grande action
static String[] getActions(String[] company, int[][] actions){

    Map<String, Integer> result = new HashMap<>();
    for (int i = 0; i < actions.length ; i++) {
        result.put(company[i], Arrays.stream(actions[i]).boxed().reduce(0, Integer::sum));

    }
    return sortByValue(result).keySet().toArray(new String[0]);
}

public static Map<String, Integer> sortByValue(Map<String, Integer> map) {
    return map.entrySet().stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .limit(2)
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                    (oldValue, newValue) -> oldValue, LinkedHashMap::new));

            // === OU BIEN CECI ===

            return result.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())) // Trier par valeur décroissante
                .limit(3) // Prendre les 3 premières entrées
                .map(Map.Entry::getKey) // Extraire les clés
                .toArray(String[]::new);
}

-------------------

public static int[] filterDuplicates(int[] data) {
    Set<Integer> seen = new LinkedHashSet<>(); // Utilise un LinkedHashSet pour préserver l'ordre
    for (int num : data) {
        seen.add(num); // Ajoute chaque élément, les doublons seront ignorés
    }
    
    // Convertir le Set<Integer> en int[]
    return seen.stream().mapToInt(Integer::intValue).toArray();
}

==== ou ===
public static int[] filterDuplicates(int[] data) {
    List<Integer> list = new ArrayList<>();
    for (int num : data) {
        if (!list.contains(num)) { // Vérifie si l'élément est déjà présent
            list.add(num);
        }
    }
    return list.stream().mapToInt(Integer::intValue).toArray();
}

--------------------

public static String[] filterWords(String[] words, String letters) {
    String[] lettersArr = letters.split("");
    List<String> result = new ArrayList<>();
    for (int i = 0; i < words.length; i++) {
        String currentWord = words[i];
        for (int j = 0; j < lettersArr.length; j++) {
            if (currentWord.contains(lettersArr[j])) {
                result.add(currentWord);
                break;
            }
        }
    }
    return result.toArray(new String[0]);
}


-----------------------

public static int computeMultiplesSum(int n) {
    int sum = 0;
    
    // Parcourir tous les nombres inférieurs à n
    for (int i = 1; i < n; i++) {
        // Vérifier si i est multiple de 3, 5 ou 7
        if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
            sum += i;
        }
    }
    
    return sum;
}

--------------------------

// A.........*====#______X-+-+-+-+-+-Z
//reconstituer un message qui a été coupé en morceaux.

public static String rebuildMessage(String[] parts) {
    
    String result = getFirstpart(parts);
    char lastCharact = result.charAt(result.length()-1);

     while(result.charAt(result.length()-1) != 'Z') {
         for (int i = 0; i < parts.length; i++) {
             if (parts[i].charAt(0) == lastCharact) {
                 result += parts[i].substring(1, parts[i].length());
                 lastCharact = parts[i].charAt(parts[i].length() - 1);
             }
         }
     }
     return result;
}

public static String getFirstpart(String[] parts){
    for (int i = 0; i < parts.length; i++) {
        if(parts[i].charAt(0) == 'A')
            return parts[i];
    }

    return null;
}

------------
// 214 / 300 sur le codingame

public static String fizzBuzz(int number, Map<Integer, String> map) {

    String result = "";
    int countdivFound = 0;
    
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
        Integer key = entry.getKey();
        String value = entry.getValue();

        if (number % key == 0) {
            result += String.valueOf(value);
            countdivFound++;
        }
    }

    if (countdivFound > 0)
        return result;

    return Integer.toString(number);
}


-------------

// 80 / 100 sur le codingame
public static String translate(String text) {
    // Write your code here
    // To debug: System.err.println("Debug messages...");

    String[] arr = text.split("");

    String result = "";
    String scrypt = "aeiou";
    for(int i=0; i<arr.length; i++){
        boolean sr = false;
        if(scrypt.contains(arr[i])){
            if(i>0 && !scrypt.contains(arr[i-1])){
                result = result + "av" + arr[i];
            }
            sr = true;
        }
        if(!sr)
            result = result + arr[i];
    }
    
    return result;
}


-----------------------
    public static int LuckyMoney(int money, int giftees)
    {
        int dist = (money / 8);
        if((giftees - dist) == 1)
            return dist - 1;

        if(dist > giftees)
            return giftees;

        return dist;
    }
-------------------------

public static String isDuoDigit(int number) {
        // Write your code here
        
        String[] str = String.valueOf(number).split("");
        List<String> list = new ArrayList<>();

        int count = 0;
        for(int i =0; i<str.length;i++){
            
            if(!list.contains(str[i])){
                list.add(str[i]);
                count++;
                if(count > 2)
                    return "n";
            }
        }

        return "y";

    }


-----------------------------------

public static int[] countFrequencies(String[] words) {
    // créer une map pour stocker les fréquences des mots
    Map<String, Integer> frequencies = new HashMap<>();
    
    // compter les fréquences des mots
    for (String word : words) {
        if (frequencies.containsKey(word)) {
            frequencies.put(word, frequencies.get(word) + 1);
        } else {
            frequencies.put(word, 1);
        }
    }
    
    // trier les fréquences par ordre alphabétique
    List<String> sortedWords = new ArrayList<>(frequencies.keySet());
    Collections.sort(sortedWords);
    
    // créer un tableau d'entiers contenant les fréquences triées
    int[] counts = new int[sortedWords.size()];
    for (int i = 0; i < sortedWords.size(); i++) {
        counts[i] = frequencies.get(sortedWords.get(i));
    }
    
    return counts;
}

---------------------------
    //String parser parrenthese
    public static boolean check(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
-----------------------------

public static int longestProfit(int[] data) {
    int n = data.length;
    int[] dp = new int[n]; // dp[i] représente la longueur de la plus longue séquence de bénéfices croissants se terminant à l'indice i
    int maxLen = 0;
    
    // Initialisation : chaque élément forme une séquence de longueur 1
    for (int i = 0; i < n; i++) {
        dp[i] = 1;
    }
    
    // Calcul de la solution par programmation dynamique
    for (int i = 1; i < n; i++) {
        for (int j = 0; j < i; j++) {
            if (data[i] > data[j]) {
                dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }
        maxLen = Math.max(maxLen, dp[i]);
    }
    
    return maxLen;
}

-----------------

public static int computeCheckDigit(String identificationNumber) {
        int sumEven = 0, sumOdd = 0;

        for (int i = 0; i < identificationNumber.length(); i++) {
            int digit = Character.getNumericValue(identificationNumber.charAt(i));

            if (i % 2 == 0) {
                sumEven += digit; // Positions paires (0, 2, 4, ...)
            } else {
                sumOdd += digit;  // Positions impaires (1, 3, 5, ...)
            }
        }

        sumEven *= 3; // Multiplier la somme des positions paires par 3
        int totalSum = sumEven + sumOdd;
        int lastDigit = totalSum % 10; // Récupérer le dernier chiffre

        return (lastDigit == 0) ? 0 : 10 - lastDigit;
    }

-------------------

public static boolean isTwin(String a, String b) {
    if (a.length() != b.length()) {
        return false;
    }

    char[] arrA = a.toLowerCase().toCharArray();
    char[] arrB = b.toLowerCase().toCharArray();

    Arrays.sort(arrA);
    Arrays.sort(arrB);

    return Arrays.equals(arrA, arrB);
}

-------------------------------

public static int findNetworkEndpoint(int startNodeId, int[] fromIds, int[] toIds) {
    // Write your code here
    // To debug: System.err.println("Debug messages...");

    Map<Integer, Integer> result = new HashMap<>();
    for(int i = 0; i < fromIds.length; i++ ) {
        int from = fromIds[i];
        int to = toIds[i];

        result.put(from, to);
    }
    int current = startNodeId;
    Set<Integer> tmp = new HashSet<>();
    int lastNode = -1;

    while(result.containsKey(current)) {
        if(tmp.contains(current)) {
            return lastNode;
        }
        tmp.add(current);
        lastNode = current;
        current = result.get(current);
    }
    return current;
}


---------------------------------------------------
public static int computeMultiplesSum(int n) {
    int sum = 0;
    for (int i = 1; i < n; i++) {
        if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
            sum += i;
        }
    }
    return sum;
}

--------------------------------
// convert List to array
List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
int[] array = list.stream().mapToInt(i -> i).toArray();

------------------

public static String computeGameState(String nameP1, String nameP2, String[] wins) {
    // Scores initiaux (compte le nombre de balles gagnées)
    Map<String, Integer> scoreCount = new HashMap<>();
    scoreCount.put(nameP1, 0);
    scoreCount.put(nameP2, 0);

    // Scores en points du tennis
    int[] points = {0, 15, 30, 40};

    // Calcul des balles gagnées
    for (String winner : wins) {
        scoreCount.put(winner, scoreCount.get(winner) + 1);
    }

    int scoreP1 = scoreCount.get(nameP1);
    int scoreP2 = scoreCount.get(nameP2);

    // Gestion des cas spéciaux (40+, Avantage, Win, Deuce)
    if (scoreP1 >= 3 && scoreP2 >= 3) {
        if (scoreP1 == scoreP2) {
            return "DEUCE";
        } else if (Math.abs(scoreP1 - scoreP2) == 1) {
            return (scoreP1 > scoreP2 ? nameP1 : nameP2) + " ADVANTAGE";
        } else if (Math.abs(scoreP1 - scoreP2) >= 2) {
            return (scoreP1 > scoreP2 ? nameP1 : nameP2) + " WINS";
        }
    }

    // Affichage du score classique
    String scoreStrP1 = (scoreP1 < 3) ? String.valueOf(points[scoreP1]) : "40";
    String scoreStrP2 = (scoreP2 < 3) ? String.valueOf(points[scoreP2]) : "40";

    // Gestion de l'affichage des égalités (15a, 30a)
    if (scoreP1 == scoreP2 && scoreP1 < 3) {
        return scoreStrP1 + "a";
    }

    return nameP1 + " " + scoreStrP1 + " - " + nameP2 + " " + scoreStrP2;
}

--------------------

SOLDE discount%

public static int calculateTotalPrice(int[] prices, int discount) {

    int maxPrice = 0;
    double totalPrice = 0;
    for (int i = 0; i < prices.length; i++) {
        int currentPrice = prices[i];
        if (currentPrice > maxPrice) {
            maxPrice = currentPrice;
        }
        totalPrice += currentPrice;
    }

    totalPrice -= (double) maxPrice * discount / 100;

    return (int) Math.floor(totalPrice);
}

--------------------------------

    ESTIMATION PI

public class MonteCarloPi {
    public static double approx(double[][] pts) {
        int insideCircle = 0;
        int totalPoints = pts.length;

        for (double[] point : pts) {
            double x = point[0];
            double y = point[1];

            // Vérifier si le point est dans le quart de cercle
            if (x * x + y * y <= 1) {
                insideCircle++;
            }
        }

        // Approximation de π : (points dans le cercle / total points) * 4
        return 4.0 * insideCircle / totalPoints;
    }

-------------------------------



public final class Person { // La classe reste `final` pour éviter l'héritage

    private final String name;
    private final Date birthDate; // Date est mutable, on doit la sécuriser

    /**
     * Creates a Person with the given name and birth date.
     */
    public Person(String name, Date birthDate) {
        this.name = name;
        // Création d'une copie défensive de la Date pour éviter les modifications externes
        this.birthDate = new Date(birthDate.getTime());
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        // Retourne une copie défensive pour éviter toute modification externe
        return new Date(birthDate.getTime());
    }
}

----
CODE:FunctionServerless
REP:FunctionServerless

CODE:try (ObjectInputStream objInputStream = new ObjectInputStream(inputStream))
REP: setObjectInputFilter

git reflog

ng eject

git shortlog


nullInputStream

commande affiche, pour chaque ligne de code du fichier index.html, la révision et lauteur...
   -git blame index.html


   https://www.typescriptlang.org/play?#code/PTAEFkHsBMFMCcB2oBSBDAbmgygY3gJYAOALqGtHNOaAO5oCeoJkoAFmotADayi5pu3AEZpcAawDOoAsk4AoEKFi8A5pzL0mwphWizVNAArxIAWwKS+oq9QCCRgJJ02BXG3ZppkorFwFBRTBJBkQSNAAPZg4yXhJpBkgAV2Z4WDQyL1D3U0Rk6VwYPi9o5NUPAhIg8lx40BDEHMg8pMluBgA6eWqAGQJxYqFQbk5VJLRVPgAzdJIktMkAGmjLGWk0VIpYAFpIKamZRGrCsyJeCMqGAC5QMzRxAxoppMaSAmbyBtxb9MQE5PgoDScyQ1Sw3CSsHWaTo8DQRF81FkoBM5ksUI6oAA6jFQK1YNQWEDYCC5NVJCRCIhVMs8rRiaT1ijTBYrAAeClU1QAPi68kKfzIz0aoAAvKAABQASjF3NAACIrvQMLArvKANz85oUz7ZABiL2+4qyIulsoVSswqo13QFOrMDGwlMe4uFuGlmrtZAdqNZsCdXLFusaBsaHu6DoDBg6vGpJDYmuqPpZ6Kj1LWxhTVlpkDI8b4nIMVwjDF9qed1JjsDjCe6SgAmsl+Jw8VZosV6JVQAMGLRIPBCawBSr4JlQEQs7BqrIiZVpODIZiACowRjLfNt5rtOj98SHSQEODkORfaput7NPle24MLFwhEIUO1d7IY1fSUy0VygDe8lA-G1b1HQrQxXUNcN-2vB0ACUoUgbgVWgMsrDTUDyE7TIvifcM-1AJQADUAnbdC0C7Hs+wHHN6RguCEIJZD-RA3ClFWDZC2pXDIxAqsa01f8aMkeDEIY1CeNUeNNQAX0TJQAGEihcNwKmkeAXkQR4MCIls0Aw5tkHjUx6QQUx4CWapOCREgAHJpAIU5+3CMJmCHDJ3FKNtjP7bxzFgWg2AQWAr0Am8lzYQyDCfC9X2Db4zS-UBf3-AzIHpRBfNAABReATIleUABFWDyMgBCGeNLHlKUpJksAsT4ARkFoe9myER5tPfc8X0OGhKSYAQSDclhqg4LheGbKxpD8gLiI6j4xDqF5YAiXxagJdogsFGLIpfWTXNcdM32yD9zUSgCNpo0l8MESEg3lAAJFRuFYCjuGgG0kvgJgTv-HTSKA0LwupLbmgg0BJObfqPAlTz4BlL7TsE3gOmh3KHX+lKIsNKLQCmUjeFe5Zocq3DJNw4F5mQc7ycuiFYCquswDy66iXzZR4FUZo0VwaQ9hWaQHGcYRYEeIX80BMmkAMcz6gMUaF1gZZ+2iAGaVARIUkkNhkhe+HDwQUA9hmLlp0QKZ+zuLG0GEZI8384lJCSbgyFkA8jxZ8W0uoOXj2gap8SVlL9cQbdJuQQSzBJPbDEpB2mEW3BYFIF9BE8SRqkgXBcHmNJoHWnVFrQU5eGwABHcY0mgyBcyB6KTVi2QiCSEgbk4BhPx-XCCAOCVLAAOTQHvu8QBuSClWHcKSsKA7S+kspy+UAHkg6YRAkjMQXTPIGExHj0gCQqvjQe6f9O8levG9ANlQAABjH-9-3dhL6iSDOoUkG4ce4bMfkkSQJlVBUdqICKvUUuaAYSmFzKANK6g3gqigavde8pQYHzBioNscMH7fifi-H+Nxo7y1AHLG44AMhsA6JIYuo5B7DxlNJYm8g6HVFCtWaamNOp2lXggAoLZ3B+D3MiN2UIiDamKFwM8BAxgwmti4DIzlQDQCepUDwasxYknJoQq6gVsSuFGmVVOLEmTOk0snfOhcCHNHjqrJsHA4EUjASQAkO54APHTLQJR1Q0okAoi4wwhRXb+TbPzaQgsTh8AovGYii1KRsVCOECIudir+QkCXMusAK6QIOqaIh8C14IDbglXC14FjCL+HwY0ulTFnH9KA8ulcSDVwlHLImx8u7FJEeQ5+8cf63zvm00pHQ5YoIYdVUAdgvjADsLpFgkA9x+LCa4Nyj0ZmOO4P0PgejizVEmCQWCPgRESnmNwZYEo+lWHyb+JQ-5tm7JKVYE5Qj2mHOOVYAU0AbkiPOdUO+8MyCnNgHlDIGxxQvOaG8h5-ToCAq+Xfa54K7l-IBeEDoTzJRlQHO80pnzLnfNAB0PF0L-ySSlNCol1RSXVDsFwYYJIZBkBCT5YYsh0iAlWQMTZSgilwrKSRLssK9mlIOfAbgxKOXBRBVwDFbZym-VAHy25sB7n8qsMioVIqwCcqVf8wFQZxVgs1R0SF4RjjBTRXq+VQYfq8pJJKhVCLAUquFdUPFfIlA4iUnpW49x1m2zmdLYqj0rCAiJLwKYZACSTGWBZaogtiQUDoEomgdpLAOKcvANgDB4xmA6EAA


   https://stackoverflow.com/questions/67926162/how-to-solve-a-box-claw-mover-so-it-spread-all-boxes-evenly-on-all-available-sta

   https://codecraft.tv/courses/angular/built-in-directives/ngstyle-and-ngclass/

   https://chat.openai.com

$

€


