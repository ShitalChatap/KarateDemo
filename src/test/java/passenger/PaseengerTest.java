package passenger;


import com.intuit.karate.junit5.Karate;

public class PaseengerTest
{
	@Karate.Test
	Karate Testtag()
	{
		return Karate.run("classpath:passenger").tags("@execute").relativeTo(getClass());
	}

}
