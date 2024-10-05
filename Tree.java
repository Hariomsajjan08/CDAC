class Tree{
	//starting point of the tree
	Node root;
	
	//Node structure
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int value){
			this.data=value;
			left=right=null;
		}
	}
	
	//kepting root as null
	Tree(){
		root=null;
	}
	
	//initiazlie first node 
	Tree(int value){
		root = new Node(value);
	}
	
	Node  insert(Node root, int value){
		//tree is empty then create new node
		if(root == null){
			root = new Node(value);
			return root;
		}
		if(value<=root.data){
			root.left = root.insert(root.left,value);
		}else{
			root.right=root.insert(root.right,value);
		}
	}
	
	Node deletion(Node root, int value){
		if(root==null){
			return root;
		}
		if(value<.root.data){
			root.left = root.deletion(root.left,value);
		}else if(value>root.data){
			root.right=root.deletion(root.right,value);
		}else{
			if(root.left==null){
				return root.right;
			}else if(root.right==null){
				return root.left;
			}
			//case3
			root.data=minValue(root.right);
			rood.right=deletion(root.right,root.data);
			
		}
		in minValue(Node root){
			int x = root.data;
			while(root.left!=null){
				x=root.left.data;
				root=root.left;
			}
			return x;
		}
	}
}