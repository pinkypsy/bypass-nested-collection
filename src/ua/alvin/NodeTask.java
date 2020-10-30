package ua.alvin;

public class NodeTask {

    public static void main(String[] args) {

        Node rootFolder = new Node("rootFolder", NodeType.FOLDER);

        Node musicFolder = new Node("musicFolder", NodeType.FOLDER);
        Node metallica = new Node("metallica", NodeType.FILE);
        Node anthrax = new Node("anthrax", NodeType.FILE);

        Node filmFolder = new Node("filmFolder", NodeType.FOLDER);
        Node fountain = new Node("fountain", NodeType.FILE);
        Node matrix = new Node("matrix", NodeType.FILE);


        rootFolder.addChildNodes(musicFolder,filmFolder);
        musicFolder.addChildNodes(metallica,anthrax);
        filmFolder.addChildNodes(fountain,matrix);

        anthrax.addChildNodes(new Node("3", NodeType.FILE),new Node("4", NodeType.FILE));
        metallica.addChildNodes(new Node("1", NodeType.FILE),new Node("2", NodeType.FILE));

        Solution.iterate(rootFolder);

        // write your code here
    }
}
