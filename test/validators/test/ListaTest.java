package validators.test;
import static org.junit.Assert.*;
import junit.framework.TestCase;
import org.junit.Test;
import validators.Lista;

public class ListaTest extends TestCase
{

	@Test
	public void testOrdernarReves()
	{
		String[] e1 = {"a","b","c","d","e"};
		Lista expected = new Lista(e1);

		String[] e2 = {"e","d","c","b","a"};
		Lista reves = new Lista(e2);

		this.assertEquals(expected, reves.ordenar());
	}

	@Test
	public void testOrdernarIguales()
	{
		String[] e1 = {"a","a","a","a","a"};
		Lista expected = new Lista(e1);

		String[] e2 = {"a","a","a","a","a"};
		Lista reves = new Lista(e2);

		this.assertEquals(expected, reves.ordenar());
	}

	@Test
	public void testOrdernarNulo1()
	{
		Lista expected = null;
		this.assertNull(expected);
	}

	@Test
	public void testOrdernarNulo2()
	{
		String[] e1 = null;
		Lista expected = new Lista(e1);

		String[] e2 = null;
		Lista reves = new Lista(e2);

		this.assertEquals(expected, reves.ordenar());
	}

	@Test
	public void testOrdernarListaVacia()
	{
		String[] e1 = {};
		Lista expected = new Lista(e1);

		String[] e2 = {};
		Lista reves = new Lista(e2);

		this.assertEquals(expected, reves.ordenar());
	}
}


