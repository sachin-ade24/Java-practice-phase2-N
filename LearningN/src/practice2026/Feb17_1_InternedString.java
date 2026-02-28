package practice2026;

public class Feb17_1_InternedString {

	public static void main(String[] args) {
		
		//Phase1:
		/*
		1. String Literal: A String literal is a String value written directly 
						   in double quotes in Java code.
		*/
		
		String s1 = "Java";

		/*
		Here:
		1. "Java" is a String literal
		2. It is known at compile time
		*/
		
		/*
		🔹 Where Are String Literals Stored?

		   👉 String literals are stored in the String Constant Pool (SCP).

		   What JVM Does:

		   JVM checks SCP

		   If "Java" i.e. the string literal exists → reuse it

		   If not → create it once and store in SCP

		   Example:
				String a = "Java";
				String b = "Java";

		   ✔ Only ONE "Java" object in SCP
		   ✔ Both a and b point to the same object

				SCP:
				"Java"  ← a, b
				
				
		   🔑 Key Properties of String Literals:
				
				| Property         | Value                |
				| ---------------- | -------------------- |
				| Created at       | Compile time         |
				| Stored in        | String Constant Pool |
				| Reused           | Yes                  |
				| Mutable          | ❌ No                |
				| Memory efficient | ✅ Yes               |	

		*/
		
		/*
		2️. Interned String
		✅ Definition

		An interned String is a String that is explicitly placed into the String Constant 
		Pool using the intern() method.
		*/

		String str = s1.intern();
		/*
		 * String java.lang.String.intern ()
		 * Returns a canonical representation for the string object. 
		   A pool of strings, initially empty, is maintained privately by the class String. 
		   When the intern method is invoked, if the pool already contains a string equal to 
		   this String object as determined by the equals(Object) method, then the string 
		   from the pool is returned. Otherwise, this String object is added to the pool and a 
		   reference to this String object is returned. 
		 * It follows that for any two strings s and t, s.intern() == t.intern() is true 
		   if and only if s.equals(t) is true. All literal strings and string-valued constant 
		   expressions are interned. String literals are defined in section {@jls 3.10.5} of 
		   the The Java Language Specification.
		 * Returns:a string that has the same contents as this string, but is guaranteed to be from a pool of unique strings.
		 * */
		
		String s2 = new String();
		String s3 = s2.intern();
		
		/*
		🔹 Why Do We Need Interned Strings?

		Because:
		Strings created at runtime (via new, StringBuilder, toString(), +)
		Do NOT go to SCP automatically
		They live in the Heap

		👉 intern() allows us to manually put them into SCP
		
		*/
		
		/*
		
		3️. Example: Runtime String (NOT a Literal)
		String s1 = new String("Java");

		What happens:
		- "Java" literal → SCP (if not present)
		- new String("Java") → Heap

		Memory allocation:
		- Heap:
		  "Java"  ← s1
		- SCP:
		  "Java"

		❌ s1 does NOT point to SCP

		4️. Interning That String
		String s2 = s1.intern();

		What JVM does:
		- Checks SCP
		- "Java" exists → return SCP reference
		- s2 now points to SCP

		Heap:
		"Java"  ← s1
		SCP:
		"Java"  ← s2
		
		Reference Comparison:
		System.out.println(s1 == s2); // false
		System.out.println(s2 == "Java"); // true
		
		*/
		
		/*
		
		5️. Runtime String via StringBuilder (Very Important)
		
		   String s = new StringBuilder("Ja").append("va").toString();

		✔ Created at runtime
		✔ Stored in Heap
		✔ NOT a literal
		✔ NOT in SCP

		Interning It:
		String s2 = s.intern();

		✔ Now it is in SCP
		✔ s2 == "Java" → true

		| Feature            | String Literal | Interned String |
		| ------------------ | -------------- | --------------- |
		| How created        | `"Java"`       | `intern()`      |
		| When created       | Compile time   | Runtime         |
		| Stored in SCP      | ✅ Yes         | ✅ Yes          |
		| JVM reuse          | Automatic      | Explicit        |
		| Programmer control | ❌ No          | ✅ Yes          |
		
		*/
		
		/*
		 7. Only string literals and interned strings go to SCP
	    */
		
		/*
		
		8️ Why JVM Does NOT Auto-Intern Runtime Strings?

		  Because:
			- Interning has performance cost
			- SCP is limited memory
			- Auto-interning can cause memory pressure

		  So JVM leaves the decision to developer.

		9️. Very Important:
		   🔹 String Literal: A String literal is a compile-time constant written in double 
		                      quotes and stored in the String Constant Pool.

		   🔹 Interned String: An interned String is a runtime String explicitly added to 
			                   the String Constant Pool using the intern() method.
		*/
		
		/*
		IMP:
		"Java"                → String literal → SCP
		new String("Java")    → Heap
		StringBuilder.toString→ Heap
		intern()              → SCP
		
		
		*/
		
		
	//==================================================================================
		
		//Phase2:
		
		/*
		
		1️. What happens here?
		
		String s1 = new String("Java");
		
		This one line creates TWO things:
		✅ Step 1: String literal "Java"
		   - JVM checks String Constant Pool (SCP)
		   - If "Java" is not present, it is created in SCP
		   - If already present, JVM reuses it
		✅ Step 2: new String("Java")
		   - Creates a new String object in Heap		
		   - This heap object has the same value, but is a different object		
		   - s1 points to the heap object, NOT SCP
		
		So now memory looks like this:
		SCP:     "Java"
        Heap:    new String("Java")
                 ↑
                 s1
		
		2️. Now this line 👇
		
		String s2 = s1.intern();
		
		What intern() actually does:
		
		JVM checks SCP for a string with the same content
		 - If found → returns reference from SCP
		 - If NOT found → adds the string to SCP and returns it
		
		Since "Java" already exists in SCP, JVM:
		 - Does NOT create anything new
		 - Simply returns the SCP reference
		
		SCP:     "Java"  ← s2
		Heap:    new String("Java")
         		 ↑
         		 s1
        
        So,
        ✔ s1 → Heap
		✔ s2 → SCP
		
		3️. Very important confirmations ✅
		✔ Is SCP checked first during intern()?
		YES — always
		
		✔ Does intern() move heap object into SCP?
		❌ NO
		It only returns the SCP reference
		
		✔ Do we end up with two objects?
		✔ Yes, unless the string was never created with new
		
		
		4️. Let’s prove it with code 🧠
		
		String s1 = new String("Java");
		String s2 = s1.intern();
		
		System.out.println(s1 == s2);      // false
		System.out.println(s1.equals(s2)); // true
		
		Why?
		== → compares references
		equals() → compares content
		
		
		5️. Case where ONLY one object exists 🟢
	
		String s1 = "Java";
        String s2 = "Java";
        
        Here:
		- Only ONE object in SCP
		- Both references point to the same object
		
		s1 == s2  // true
		
		Important:
		intern() always returns the String Constant Pool reference, creating one only if it 
		does not already exist.
		
		 */
		
		 

	}

}
