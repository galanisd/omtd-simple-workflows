package eu.openminted.simplewokflows.dkpro;

public class PipelinePDFToXmiRunner {

	public static void main(String args[]) throws Exception {
		String inputFolder = "C:/Users/galanisd/Desktop/Dimitris/EclipseWorkspaces/ILSPMars/omtd-simple-workflows/testInput/";
		String outputFolder = "C:/Users/galanisd/Desktop/Dimitris/EclipseWorkspaces/ILSPMars/omtd-simple-workflows/testOutput/";

		String myargs[] = { inputFolder, outputFolder };
		//String[] myargs = args;

		PipelinePDFToXMI.main(myargs);
	}
}
