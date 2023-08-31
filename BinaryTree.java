public class BinaryTree<ContentType> {
    BinaryTree<ContentType> leftTree;
    BinaryTree<ContentType> rightTree;
    ContentType content;

    BinaryTree() {
        this.leftTree = null;
        this.rightTree = null;
        this.content = null;
    }

    BinaryTree(ContentType pContent ) {
        this.leftTree = new BinaryTree<ContentType>();
        this.rightTree = new BinaryTree<ContentType>();
        this.content = pContent;
    }

    BinaryTree(ContentType pContent , BinaryTree<ContentType> pLeftTree ,
        BinaryTree<ContentType> pRightTree ) {
        this.leftTree = pLeftTree;
        this.rightTree = pRightTree;
        this.content = pContent;
    }

    public void setContent(ContentType pContent ){
        if (this.content == null) {
            this.rightTree = new BinaryTree<ContentType>();
            this.leftTree = new BinaryTree<ContentType>();
        }
        this.content = pContent;
    }

    public ContentType getContent() {
        return this.content;
    }

    public void setLeftTree(BinaryTree<ContentType> pTree ) {
        this.leftTree = pTree;
    }

    public BinaryTree<ContentType> getLeftTree() {
        return this.leftTree;
    }

    public void setRightTree(BinaryTree<ContentType> pTree ){
        this.rightTree = pTree;
    }

    public BinaryTree<ContentType> getRightTree() {
        return this.rightTree;
    }
}
