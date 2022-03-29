package view;

import java.util.concurrent.Semaphore;

import contrroller.ativi;

public class principal 
{

	public static void main(String[] args)
	{
	int permissoes = 1;
		Semaphore semaforo = new Semaphore(permissoes);

		for (int idpessoa = 1; idpessoa < 5; idpessoa++) 
		{
			Thread pessoas = new ativi(idpessoa, semaforo);
			pessoas.start();
		}
	}

}