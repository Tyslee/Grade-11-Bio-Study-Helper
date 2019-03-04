import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;
public class ISU {

	public static void intro(){
		System.out.println("Welcome to a grade 11's guide to Viruses!\n");
		enter();
	
		System.out.println("In my program, you will learn the following lessons on Viruses: ");
		System.out.println("   - Classification of Viruses\n   - Viral Reproduction\n   - Treating Viral Diseases\n   - Practical Uses of Viruses\n");
		enter();
		System.out.println("\nYou might be asking yourself, 'Why should I learn about Viruses?'.\nWell, simply because viruses are highly misunderstood and underestimated.\nMany people accross the world continue to mistakenly use word virus and bacteria interchangabally \nHowever, these two micro-organisms are very different, I hope that using my program, I could shed some light on the matter.\n");
		enter1();
	}
	
	public static int lesson1 (int quiz1done){
		System.out.println("_________________________________________________________________________________________________________________________________________________\n");
		System.out.println("\n\nClassification of Viruses\n_________________________\n");
		System.out.println("Viruses can be classified into different groups based on some key features: ");
		System.out.println("\na) Structure and Symmetery\n\n- Shape is determined by the proteins that make up the capsid.\n- Typical Viruses are either:\n\t- Icosahedral (Polyhedral)\n\t- Cylindrical/Helical\n\t- Complex (Combination)\n");
		enter();
		System.out.println("\n\nClassification of Viruses\n_________________________\n");
		System.out.println("b) Type of Nucleic Acid\n\n- Viruses either contain RNA (ribonucleic acid) or DNA (Deoxyribonucleic acid), never both.\n- Viruses can be divided into those that have single stranded nucleic acids and those that don't.\n");
		enter();
		System.out.println("\n\nClassification of Viruses\n_________________________\n");
		System.out.println("c) Viral Envelope\n\n- In some viruses, the capsid is enclosed in a lipid envelope derived from the host cell or nuclear membrane.\nThis membrane may incorporate viral-encoded proteins (antigens) that are used to attach to other host cells.\n");
		enter();
		System.out.println("\n\nClassification of Viruses\n_________________________\n");
		System.out.println("d) Host Specificity\n\n- Some viruses only infect a specific host. This is called viral specificity.\n- Viral specificity is determined by the viruses that recongnize specific proteins found on the surface of different cells.\n");
		enter();
		System.out.println("\nClassification of Viruses\n_________________________\n");
		System.out.println("e) Type of Viral Growth (replication) Cycle\n\n- Some viruses replicate using the lytic cycle in which the host cell is killed.\n- Some viruses (ex. Bacteriophage) can integrate their DNA into the host cell.\nThis is referred to as the lysogenic cycle and these viruses are call Temperate Viruses.\n\nAnd with that we're done the classification portion of the unit!\n");
		enterQuiz();
		System.out.println("_________________________________________________________________________________________________________________________________________________\n");
		System.out.println("Question 1: What is an antigen?\n\ta) A viral encoded-protein that is used to attach to other host cells\n\tb) An anti-viral substance produced by the immune system\n\tc) A microorganism that can cause disease\n");
		String q1 = answer();
		double count = 0;
		if(q1.equals("a")||q1.equals("A")){
			System.out.println("\nCorrect!\n");
			count++;
		}
		else{
			System.out.println("\nIncorrect\n");
		}
		next();
		System.out.println("Question 2: The shape of a viral capsid cant be...\n\ta) Icosahedral\n\tb) Complex\n\tc) Hexagonal\n\td) Cylindracal\n");
		String q2 = answer();
		if(q2.equals("c")||q2.equals("C")){
			System.out.println("\nCorrect!\n");
			count++;
		}
		else
			System.out.println("\nIncorrect\n");
		next();
		System.out.println("Question 3: What do you call a virus with a lysogenic cycle?\n\ta) A temperate virus\n\tb) A virulent virus\n\tc) A barolynt virus\n\td) none of the above\n");
		String q3 = answer();
		if(q3.equals("a")||q3.equals("A")){
			System.out.println("\nCorrect!\n");
			count++;
		}
		else{
			System.out.println("\nIncorrect\n");
		}
		next();
		System.out.println("Question 4: Viruses belong to which kingdom?\n\ta) Animalia\n\tb) Protista\n\tc) Fungi\n\td) Bacteria\n\te) None of the above\n");
		String q4 = answer();
		if(q4.equals("e")||q4.equals("E")){
			System.out.println("\nCorrect!\n");
			count++;
		}
		else{
			System.out.println("\nIncorrect\n");
		}
		next();
		System.out.println("Question 5: How does viral specificity distinguish between different cells?\n\ta) Size of the cell\n\tb) Chemicals excreted by the cell\n\tc) Specific proteins on the surface on the cell\n\td) Color of the cell\n");
		String q5 = answer();
		if(q5.equals("c")||q5.equals("C")){
			System.out.println("\nCorrect!\n");
			count++;
		}
		else{
			System.out.println("\nIncorrect\n");
		}
		System.out.println("You got " + count + "/5 correct\n");
		if(count/5>0.5){
			System.out.println("Congratulations! You passed this quiz!\n");
			enter1();
			return 1;
		}
		else{
			System.out.println("Unfortunately, you have failed. Please pass this quiz in order to unlock the test\n");
			enter1();
			return 0;
		}
	}
	public static int lesson2 (int quiz2done){
		System.out.println("_________________________________________________________________________________________________________________________________________________\n");
		System.out.println("\n\nViral Reproduction\n_________________________");
		System.out.println("\nThe Lytic Cycle\n\n- The virus lyses (destroys) the host cell.\n- Virulent virus: A virus that has a lytic cycle.\n- ~30-35 minutes to occur\n");
		enter();
		System.out.println("\n\nViral Reproduction\n_________________________");
		System.out.println("\n5 Steps of the Lytic Cycle\n\n1. Attachment: the virus attaches to receptors on the host cell surface\n2. Entrance: the nucleic acid (genetic material) of the virus is inserted through the cell membrane into the cytoplasm of the host cell.\nThe protein coat (Capsid) remains outside and is called a ghost.\n3. Replication: the virus induces the host cell to synthesize the necessary components from the viral DNA.\n4. Assembly: the newly synthesized viral parts are assembled into a new virus.\n5. Release: Assembled viruses are released from the cell. The host cell is destroyed.\nThe released viruses are now able to infect other cells.\n");
		enter();
		System.out.println("\n\nViral Reproduction\n_________________________");
		System.out.println("\nThe Lysogenic Cycle\n\n- The virus integrates its genetic information into the host bacterial DNA.\n- Temperate Virus: a virus that does not always destroy its host because it can enter the lysogenic cycle.\n");
		enter();
		System.out.println("\n\nViral Reproduction\n_________________________");
		System.out.println("\n5 steps of the Lysogenic Cycle\n\n1. Attachment (same as lytic cycle)\n2. Entrance (same as lytic cycle)\n3. Integration: Viral DNA becomes integrated into the host bacterial DNA and is called a prophage.\n4. Replication: The viral DNA is copied everytime the cell undergoes mitosis.\n5. Entry to Lytic cycle: external conditions can cause the viral DNA to be released from the host DNA and the virus enters the lytic cycle.\n");
		enter();
		System.out.println("\n\nViral Reproduction\n_________________________");
		System.out.println("\nRetroviruses\n\n- RNA viruses that contain RNA and an enzyme (protein) called reverse transcriptase.\n- Retroviruses only attack animal cells\n- Reverse Transcriptase: a protein that copies viral RNA and converts it into DNA so that it can then be integrated into the host cell DNA. \nBecause of this, it mutates quickly and is the hardest to treat\n");
		enter();
		System.out.println("\n\nViral Reproduction\n_________________________");
		System.out.println("\n6 steps of reproduction for a retrovirus\n\n1. Entrance: the virus enters cell by fusing with cell membrane.\n2. Reverse Transcriptase: the viral RNA is copied to DNA by reverse transcriptase.\n3. Integration: the viral DNA enters the nucleus and inegrates into the host DNA chromosomes.\n4. Replication and Synthesis: the host cell synthesizes viral proteins and RNA.\n5. Assembly: the virus particles are assembled.\n6. Release: Virus is released through budding.\n");
		System.out.println("And with that, we're done the reproduction part of the unit!\n");
		enterQuiz();
		System.out.println("_________________________________________________________________________________________________________________________________________________\n");
		System.out.println("Question 1: Which two steps are the same for both the lytic cycle and the lysogenic cycle?\n\ta) Replication and entrance\n\tb) Release and Attachment\n\tc) Integration and Replication\n\td) Attachment and Entrace\n");
		String q1 = answer();
		double count = 0;
		if(q1.equals("d")||q1.equals("D")){
			System.out.println("\nCorrect!\n");
			count++;
		}
		else{
			System.out.println("\nIncorrect\n");
		}
		next();
		System.out.println("Question 2: Retroviruses only attack which type of organism?\n\ta) Plant cells\n\tb) Animal cells\n\tc) Protists\n\td) Bacteria\n");
		String q2 = answer();
		if(q2.equals("b")||q2.equals("B")){
			System.out.println("\nCorrect!\n");
			count++;
		}
		else
			System.out.println("\nIncorrect\n");
		next();
		System.out.println("Question 3: Which replication cycle kills the host cell?\n\ta) Retrovirus cycle\n\tb) Lyctic cycle\n\tc) Lysogenic cycle\n");
		String q3 = answer();
		if(q3.equals("b")||q3.equals("B")){
			System.out.println("\nCorrect!\n");
			count++;
		}
		else{
			System.out.println("\nIncorrect\n");
		}
		next();
		System.out.println("Question 4: Which cycle doesn't integrate its genetic information into the host bacterial DNA?\n\ta) Lytic cycle\n\tb) Lysogenic cycle\n\tc) Retrovirus cycle\n");
		String q4 = answer();
		if(q4.equals("a")||q4.equals("A")){
			System.out.println("\nCorrect!\n");
			count++;
		}
		else{
			System.out.println("\nIncorrect\n");
		}
		next();
		System.out.println("Question 5: Which cycle has the most dangerous viruses/hardest to treat\n\ta) Lytic cycle\n\tb) Lysogenic cycle\n\tc) Retrovirus cycle\n");
		String q5 = answer();
		if(q5.equals("c")||q5.equals("C")){
			System.out.println("\nCorrect!\n");
			count++;
		}
		else{
			System.out.println("\nIncorrect\n");
		}
		System.out.println("You got " + count + "/5 correct\n");
		if(count/5>0.5){
			System.out.println("Congratulations! You passed this quiz!\n");
			enter1();
			return 1;
		}
		else{
			System.out.println("Unfortunately, you have failed. Please pass this quiz in order to unlock the test\n");
			enter1();
			return 0;
		}
		
	}

	public static int lesson3 (int quiz3done){
		System.out.println("_________________________________________________________________________________________________________________________________________________\n");
		System.out.println("\n\nTreating Viral Diseases\n_________________________");
		System.out.println("\nVaccines\n\t- Injection of small amounts of dead/weakened strains of virus\n\t- Your body will then make antibodies to the virus = ACTIVE Immunity\n\t- Often requires multiple shots to 'Boost' Immunity\n");
		enter();
		System.out.println("\n\nTreating Viral Diseases\n_________________________");
		System.out.println("\n\nAntiviral Drugs:\n\tClass of medications used to treat viral infections\n\n\ta) Prevent virus replication by blocking DNA/RNA synthesis (ex. acyclovir - herpes virus)\n\tb) Inhibit viral entry and exit (ex. Abreva - blocks entry of Herpes, Tamiflu - blocks exit of viruse from cells)\n\tc) Preventing spread of virus by stimulating host cell reaction (Interfeons - hepatitis)\n");
		enter1();
		return 1;
	}
	public static int lesson4(int quiz4done){
		System.out.println("_________________________________________________________________________________________________________________________________________________\n");
		System.out.println("\n\nPractical Uses of Viruses\n_________________________");
		System.out.println("\n- Gene therapy: Viruses are used to introduce new/normal genes into an organism to replace a defective gene\n- Vaccines: Dead virus/viral parts/live virus is injected into an organism to trigger immune reaction and provide immunity\n- Biological insect control: Crops are sprayed with virus to infect soecific insects and kill them\n- Bacteriophage Therapy: Used on Ready to Eat meat and poultry to prevent Listeria (a bacteria)\n");
		enter1();
		return 1;
	}
	public static int test(){
		System.out.println("_________________________________________________________________________________________________________________________________________________\n");
		double count =0;
		System.out.println("Welcome to the test! You will be tested on all of the learned material in the program. If you fail, you will be sent back to the main menu");
		testQ();
		System.out.println("Question 1: Which cycle has the most dangerous viruses/hardest to treat\n\ta) Lytic cycle\n\tb) Lysogenic cycle\n\tc) Retrovirus cycle\n");
		String q1 = answer();
		if(q1.equals("c")||q1.equals("C")){
			System.out.println("\nCorrect!\n");
			count++;
		}
		else{
			System.out.println("\nIncorrect\n");
		}
		next();
		System.out.println("Question 2: Which two steps are the same for both the lytic cycle and the lysogenic cycle?\n\ta) Replication and entrance\n\tb) Release and Attachment\n\tc) Integration and Replication\n\td) Attachment and Entrace\n");
		String q2 = answer();
		if(q2.equals("d")||q2.equals("D")){
			System.out.println("\nCorrect!\n");
			count++;
		}
		else{
			System.out.println("\nIncorrect\n");
		}
		next();
		System.out.println("Question 3: Viruses belong to which kingdom?\n\ta) Animalia\n\tb) Protista\n\tc) Fungi\n\td) Bacteria\n\te) None of the above\n");
		String q3 = answer();
		if(q3.equals("e")||q3.equals("E")){
			System.out.println("\nCorrect!\n");
			count++;
		}
		else{
			System.out.println("\nIncorrect\n");
		}
		next();
		System.out.println("Question 4: Which cycle doesn't integrate its genetic information into the host bacterial DNA?\n\ta) Lytic cycle\n\tb) Lysogenic cycle\n\tc) Retrovirus cycle\n");
		String q4 = answer();
		if(q4.equals("a")||q4.equals("A")){
			System.out.println("\nCorrect!\n");
			count++;
		}
		else{
			System.out.println("\nIncorrect\n");
		}
		next();
		System.out.println("Question 5: How does viral specificity distinguish between different cells?\n\ta) Size of the cell\n\tb) Chemicals excreted by the cell\n\tc) Specific proteins on the surface on the cell\n\td) Color of the cell\n");
		String q5 = answer();
		if(q5.equals("c")||q5.equals("C")){
			System.out.println("\nCorrect!\n");
			count++;
		}
		else{
			System.out.println("\nIncorrect\n");
		}
		next();
		System.out.println("Question 6: What is Active immunity?\n\ta) A term used when you're fully vaccinated\n\tb) A term used when your body will make antibodies to the virus\n\tc) A term used when a virus surpasses an immunity/the vaccine\n\td) When you need to be active to get full effectiveness of the vaccine\n");
		String q6 = answer();
		if(q6.equals("b")||q6.equals("B")){
			System.out.println("\nCorrect!\n");
			count++;
		}
		else{
			System.out.println("\nIncorrect\n");
		}
		next();
		System.out.println("Question 7: What is an antigen?\n\ta) A viral encoded-proteins that are used to attach to other host cells\n\tb) An anti-viral substance produced by the immune system\n\tc) A microorganism that can cause disease\n");
		String q7 = answer();
		if(q7.equals("a")||q7.equals("A")){
			System.out.println("\nCorrect!\n");
			count++;
		}
		else{
			System.out.println("\nIncorrect\n");
		}
		next();
		System.out.println("Question 8: What is gene therapy?\n\ta) When viruses are used to introduce new/normal genes into an organism to replace a defective gene\n\tb) When viruses are used to physically change the structure of different genes\n\tc) A type of vaccination\n\tc) A method used to kill all viruses in an organism\n");
		String q8 = answer();
		if(q8.equals("a")||q8.equals("A")){
			System.out.println("\nCorrect!\n");
			count++;
		}
		else{
			System.out.println("\nIncorrect\n");
		}
		next();
		System.out.println("Question 9: Which replication cycle kills the host cell?\n\ta) Retrovirus cycle\n\tb) Lyctic cycle\n\tc) Lysogenic cycle\n");
		String q9 = answer();
		if(q9.equals("b")||q9.equals("B")){
			System.out.println("\nCorrect!\n");
			count++;
		}
		else{
			System.out.println("\nIncorrect\n");
		}
		next();
		System.out.println("Question 10: Which one of these is not how anti-virals kill a virus?\n\ta) Prevent virus replication by blocking DNA/RNA synthesis\n\tb) Inhibit viral entry and exit\n\tc) Preventing spread of virus by stimulating host cell reaction\n\td) Releasing antibodies to kill viruses\n");
		String q10 = answer();
		if(q10.equals("d")||q10.equals("D")){
			System.out.println("\nCorrect!\n");
			count++;
		}
		else{
			System.out.println("\nIncorrect\n");
		}
		if(count/10>0.5){
			System.out.println("Congratulations! You passed the test!\n");
			enter();
			return 1;
		}
		else{
			System.out.println("Unfortunately, you have failed. Please try again.\n");
			enter1();
			return 0;
		}
	}
	
	public static void enter(){
		   System.out.println("Press \"ENTER\" to continue...");
		   Scanner scanner = new Scanner(System.in);
		   scanner.nextLine();
		}
	public static void enterQuiz(){
		   System.out.println("Press \"ENTER\" to continue to the quiz...");
		   Scanner scanner = new Scanner(System.in);
		   scanner.nextLine();
		}
	public static void next(){
		System.out.println("Press \"ENTER\" to go to the next question...");
		   Scanner scanner = new Scanner(System.in);
		   scanner.nextLine();
	}
	public static void enter1(){
		System.out.println("Press \"ENTER\" to progress to the main menu...");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		return;
	}
	public static String answer(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your answer: ");
		String ans=scanner.nextLine();
		return ans;
	}
	public static void testQ(){
		System.out.println("Press \"ENTER\" to go to start to test...");
		   Scanner scanner = new Scanner(System.in);
		   scanner.nextLine();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int quiz1done= 0;
		int quiz2done= 0;
		int quiz3done = 0;
		int quiz4done = 0;
		int testRes = 0;
		intro();
		do{
			System.out.println("_________________________________________________________________________________________________________________________________________________\n");
				System.out.println("\n\nA Grade 11's Guide to Viruses\n______________________________");
			System.out.print("\nLesson 1: Classification of Viruses ");
			if(quiz1done == 1){
				System.out.print("(Done)");
			}
			System.out.print("\n\nLesson 2: Viral Reproduction ");
			if(quiz2done == 1){
				System.out.print("(Done)");
			}
			System.out.print("\n\nLesson 3: Treating Viral Diseases ");
			if(quiz3done == 1){
				System.out.print("(Done)");
			}
			System.out.print("\n\nLesson 4: Practical Uses of Viruses ");
			if(quiz4done == 1){
				System.out.print("(Done)");
			}
			
			if(quiz1done == 1 && quiz2done == 1 && quiz3done == 1 && quiz4done==1){
				System.out.print("\n\n5: Final Test ");
				if(testRes == 1){
					System.out.print("(Done)");
				}
			}
			System.out.print("\n\nPlease enter which option you want to do: ");
			
			int choice = scan.nextInt();
			if (choice==1){
				quiz1done = lesson1(quiz1done);
			}
			if (choice==2){
				quiz2done = lesson2(quiz2done);
			}
			if (choice == 3){
				quiz3done = lesson3(quiz3done);
			}
			if (choice == 4){
				quiz4done = lesson4(quiz4done);
			}
			if(choice == 5 && quiz1done == 1 && quiz2done == 1 && quiz3done == 1 && quiz4done==1){
				testRes=test();
			}
			}while(testRes==0);
		System.out.println("You now know all the knowledge needed for the grade 11 virus unit! Please share your newfound knowledge on viruses with the world!");
			}
	}

