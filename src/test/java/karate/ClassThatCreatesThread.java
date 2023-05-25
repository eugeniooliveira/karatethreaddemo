package karate;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unused")
public class ClassThatCreatesThread
{
	private final Map<String, String> config;

	public ClassThatCreatesThread(final Map<String, String> config, final boolean createNewMap)
	{
		if (createNewMap)
			this.config = new HashMap<>(config);
		else
			this.config = config;
		Thread t = new Thread(new Pooler(this.config));
		t.start();
	}

	public String readMap()
	{
		String result = null;
		for (int i=0; i < 100; i++)
			result = config.get("a");
		return result;
	}

}
