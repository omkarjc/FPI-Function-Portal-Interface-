			import java.io.*;
			import static java.lang.System.*;
			class outwrite{		
					public static void main(String[] args) {
						try{
							FileWriter fw = new FileWriter("intermidiate.txt");
							PrintWriter pw = new PrintWriter(fw);

							pw.println("DATA");
							pw.close();
						}catch(IOException e){
							out.println("error");
						}
					}
				}
				
			class inread{		
					public static void main(String[] args) {
						try{
							FileReader fr = new FileReader("intermidiate.txt");
							BufferedReader br = new BufferedReader(fr);
							String str;
							while((str = br.readLine()) != null){
								out.println(str + "\n");
							}

							br.close();
							}catch(IOException e){
							out.println("error");
						}
					}
				}								