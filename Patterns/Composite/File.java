package Patterns.Composite;

public class File extends Component{

    public File(String name) {
        super(name);
    }

    @Override
    public String show(int level) {
        //throw new UnsupportedOperationException("Unimplemented method 'show'");
        return "\t|>".repeat(level) + name;
    }
    
}
