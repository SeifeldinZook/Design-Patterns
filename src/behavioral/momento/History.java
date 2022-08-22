package behavioral.momento;

import java.util.Stack;

public class History {

  private static Stack<EditorState> states = new Stack<>();

  // Pushing element on the top of the stack
  public void stack_push(EditorState state) {
    System.out.println("Push Operation: " + state.getContent());
    states.add(state);
  }

  // Popping element from the top of the stack
  public EditorState stack_pop() {
    System.out.println("Pop Operation: " + states.pop().getContent());
    return states.peek();
  }
}
