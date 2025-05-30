package Patterns.Composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Component {
    private List<Component> childs;

    public Directory(String name) {
        super(name);
        this.childs = new ArrayList<>();
    }

    public Directory addComponent(Component c) {
        childs.add(c);
        return this;
    }

    public Directory removeComponent(Component c) {
        childs.remove(c);
        return this;
    }

    @Override
    public String show(int level) {
        StringBuilder sb = new StringBuilder("\t|>".repeat(level));
        sb.append(name)
                .append("/")
                .append("\n");

        for (Component c : this.childs) {
            sb.append(c.show(level+1));
            if (c instanceof File)
                sb.append("\n");
        }

        return sb.toString();
    }
}
