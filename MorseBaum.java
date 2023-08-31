class MorseBaum {
    BinaryTree myTree;

    MorseBaum() {
        Initialisiere();
    }

    public void Initialisiere() {
        this.myTree = new BinaryTree<Character>(
            new Character(' '),
            new BinaryTree<Character>(
                new Character('e'),
                new BinaryTree<Character>(
                    new Character('i'),
                    new BinaryTree<Character>(
                        new Character('s'),
                        new BinaryTree<Character>(
                            new Character('h')
                        ),
                        new BinaryTree<Character>(
                            new Character('v')
                        )
                    ),
                    new BinaryTree<Character>(
                        new Character('u'),
                        new BinaryTree<Character>(
                            new Character('f')
                        ),
                        new BinaryTree<Character>()
                    )
                ),
                new BinaryTree<Character>(
                    new Character('a'),
                    new BinaryTree<Character>(
                        new Character('r'),
                        new BinaryTree<Character>(
                            new Character('l')
                        ),
                        new BinaryTree<Character>()
                    ),
                    new BinaryTree<Character>(
                        new Character('w'),
                        new BinaryTree<Character>(
                            new Character('p')
                        ),
                        new BinaryTree<Character>(
                            new Character('j')
                        )
                    )
                )
            ),
            new BinaryTree<Character>(
                new Character('t'),
                new BinaryTree<Character>(
                    new Character('n'),
                    new BinaryTree<Character>(
                        new Character('d'),
                        new BinaryTree<Character>(
                            new Character('b')
                        ),
                        new BinaryTree<Character>(
                            new Character('x')
                        )
                    ),
                    new BinaryTree<Character>(
                        new Character('k'),
                        new BinaryTree<Character>(
                            new Character('c')
                        ),
                        new BinaryTree<Character>(
                            new Character('y')
                        )
                    )
                ),
                new BinaryTree<Character>(
                    new Character('m'),
                    new BinaryTree<Character>(
                        new Character('g'),
                        new BinaryTree<Character>(
                            new Character('z')
                        ),
                        new BinaryTree<Character>(
                            new Character('q')
                        )
                    ),
                    new BinaryTree<Character>(
                        new Character('o')
                    )
                )
            )
        );
    }

    public String encode(Character x, BinaryTree<Character> tree) {
        if (x.equals(' ')) {
            return " ";
        }
        if (tree.getContent() == null) {
            return "";
        }

        if (x.equals(tree.getLeftTree().getContent())) {
            return ".";
        }

        if (x.equals(tree.getRightTree().getContent())) {
            return "-";
        }

        String left = this.encode(x, tree.getLeftTree());
        if (!left.equals("")) {
            return "." + left;
        }

        String right = this.encode(x, tree.getRightTree());
        if (!(right == "")) {
            return "-" + right;
        }

        return "";
    }

    public String encode(String s) {
        String ret = "";
        for (char x : s.toCharArray()) {
            ret = ret + encode(x, this.myTree) + "\\";
        }

        return ret;
    }

    public Character decode(String s, BinaryTree<Character> tree) {
        if ( s == " ") { return tree.getContent(); }

        if (s.length() == 0) {
            return tree.getContent();
        }

        if ( s.charAt(0) == '.') {
            return this.decode(s.substring(1), tree.getLeftTree());
        }

        if (s.charAt(0) == '-') {
            return this.decode(s.substring(1), tree.getRightTree());
        }

        return new Character(' ');
    }

    public String decode(String s) {
        String[] sarr = s.split("\\\\");
        String ret = "";
        for (String sub : sarr) {
            ret = ret + decode(sub, this.myTree);
        }
        return ret;
    }    

}
