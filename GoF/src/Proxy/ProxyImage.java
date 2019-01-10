/*
 * E um objeto que representa outro, isso tem como vantagem 
 * economizar memoria o outro objeto, proxy, gasta menos memoria e 
 * inicializacao.
 * 
 * */

package Proxy;

public class ProxyImage implements Image{

	private RealImage realImage;
	private String fileName;
	
	public ProxyImage(String fileName){
		this.fileName = fileName;
	}
	
	@Override
	public void display() {
		if(realImage == null){
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}
}