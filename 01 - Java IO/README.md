<h1>Competitive Programming with Java : IO</h1>
Hello,

In competitive programming, problems typically follow this format:

<i>You receive input in a specific format, and your task is to process this input to compute a result and produce output in a required format.</i>

In other words, for each competition or problem, you'll need to read input (from standard input or a file) and write output (to standard output or a file). Here’s how you can handle this in Java.

<h2>Input</h2>
I can think of three main ways of reading input, they each have their advantages and weaknesses so let’s have a look at each one of them .

<h3>Scanner</h3>
This is the easiest way , Scanner is part of the java.util package, so it’s a class from the standard library, it has multiple constructors mainly <i>Scanner(InputStream)</i> and <i>Scanner(FileInputStream)</i> . the Scanner class is great for small inputs as it’s fast to type and provides a lot of methods to read various types of data, and takes care of tokenizing a string .


```

Scanner in = new Scanner(System.in);
int a = in.nextInt();
double r = in.nextDouble();
in.close();

```

on the other hand Scanner’s only weakness is it’s Damn slow, the bigger the input the bigger the impact . with the right amount of input, your algorithm might even not get executed and you will see the dreadful time limit exceeded .

<b>Why Scanner is slow  ?</b>
Scanner uses a Regex matching algorithm to tokenize the read string, <i>sc.nextInt()</i>; is going to try and match [0-9]+ per example plus it has a small buffer size around 1024 bytes .


<h3>BufferedReader :</h3>
it’s part of the java.io package, it has multiple constructors mainly <i>BufferedReader(Reader)</i>. this is a great option for reading large amount of input , because the <i>BufferedReader</i> only reads input from the defined Stream and doesn’t do anything else a part of that, which makes it super-fast plus it has a bigger buffer around 8192 bytes .

```

BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
String line = in.readLine(); // line is: hello 1 3.0
String[] data = line.split(" ");
String word = data[0];
int number = Integer.parseInt(data[1]);
double f = Double.parseDouble(data[2]);
in.close();
```

BufferedReader’s weakness is the parsing part, as you saw in the example i need to tokenize and split the string manually, then parse it to the appropriate type which is not practical in a 2H contest .  😦
