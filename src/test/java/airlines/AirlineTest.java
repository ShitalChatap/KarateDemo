package airlines;


import com.intuit.karate.junit5.Karate;

public class AirlineTest
{
	
	@Karate.Test
	Karate Testtag()
	{
		return Karate.run("classpath:airlines").tags("@execute").relativeTo(getClass());
	}

}
