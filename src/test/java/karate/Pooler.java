package karate;

import java.util.Map;

public class Pooler implements Runnable
{
	private final Map<String, String> config;

	public Pooler(final Map<String, String> config)
	{
		this.config = config;
	}

	@Override
	public void run()
	{
		for (int i = 0; i < 1000; i++)
		{
			try
			{
				System.out.println("Pooler reading map: " + config.get("c"));
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
