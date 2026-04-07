////MORRISS TRAVERSAL ASKED IN GOOGLE AS HAVING CONSTANT sc
class Solution {     //Using ITERATIVE METHOD tc = LINEAR ANS SC = CONSTANT
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        TreeNode current = root;
        while(current != null){

            if(current.left != null){ //means not inorder yet so move left once and then right till leaf
              TreeNode pred = current.left;
              while(pred.right != null && pred.right != current){//kissi bhi karan se break ho sakta hai
                pred = pred.right;
              }
              if(pred.right == null){  //fake linking
                pred.right = current;
                current = current.left;//move left as not added yet
              }
              else if(pred.right == current){///unlinking so make pred.right  to null as it was linked tocurrent in upper
                pred.right = null;
                arr.add(current.val);
                current = current.right; //move right always whenever add new one
              }
              
            }
            else{  //agar current left null so it is inorder part so add it and move current
              arr.add(current.val);
              current = current.right;  //move right always after add
            }
        }
        return arr;
    }
 }
