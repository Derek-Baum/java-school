
public class test {
	
	public static void main(String... args){
		String s = "Wait! Before I wreck this beat, let me just check to see If Stephanie Mills left any extra refills Of ecstacy pills next to me, in the seats spilled Or she eat �em all with a breakfast drink (You inspect the sink?) In the habit of grabbin' a mic and babblin', I dabble in Vic's But I might just swallow my fuckin' Ritalin tablet after tonight I�m grabbin' it right from the medicine cabinet 'Cause that's what it�s like, and attackin' it like a Dracula bite Jetpack in a backpack when I write All this anger pent-up inside I went up inside a Bennigans diner with a cigarette lighter Figured I'd try to set a big enough fire That�ll trigger the sprinkler system And I�d escape, but the getaway driver Screwed up my limo, collided with the center divide I went through the window And ended up being pinned to the side Of a semi fender beside a friend of the guy�s wife Brenda The flight attendant from Idaho That took an antenna in the vagina hole 'Cause when I pick up a pen I'm venomous And I'm as slick as Dennis the Menace Like an evil dental hygienist, sinister You've been yellin' dementedness I invented this, I'm the genesis Eminem is a nemesis to a feminist Fuckin' smart alec degenerate I got Ellen DeGeneres tryna tell me these men are just Full of jealousy, envious of female independence Hell with a clitoris, hit or miss You will never consider this a bitter disappointment I'll never fail to deliver this Whatever the weather in this'll be Just like a certificate of authenticity that I'm thinkin' about Just tryna think of the quickest and sickest way To make 'em picket, I pick a day to be a prick Then I'm pickin' the wickedest shit to say Spit it back on a level, incredible Head full of Red Bull, unforgettable Better believe these beats are edible I consider loose leaf a vegetable And I stalk my prey You think you got away? Uh-uh, not today Murder you on a song and then I'll just say I was with Dr. Dre and Robert Blake, eatin' lobster, steak And coffee cake at a restaurant with Drake And Tech just got to make sure that our stories corroborate I'm a lot to take, like Kanye walkin' up on the stage For Beyonc�, like it's my job to say That you're not a real artist, but it's my obligation Honest Abe is on his way, you will not escape Ammunition replenished, the Punisher With his gun insured, hundred words And a clip, in other words motherfuckers better run If you're not lookin' to get run over by the roadrunner No wonder no one don't wanna go And jump in front of a fuckin' runaway locomotive Or get thrown up under it just tryna fuck with the";
		s = s.replaceAll("!", "");
		s = s.replaceAll(",", "");
		
		String output = "";
		
		String[] k = s.split(" ");
		System.out.println(k.length);
		for(int i = 0; i < k.length;i++){
			
			output+= "\"" + k[i] + "\", ";

		
			
		}
		output = output.toLowerCase();
		System.out.println(output);
	}

}
