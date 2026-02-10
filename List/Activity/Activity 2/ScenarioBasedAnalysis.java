

public class ScenarioBasedAnalysis {

//------------Key Concept---------------------------------
/*
| Data Structure | Best at                            | Weak at                      |
| -------------- | ---------------------------------- | ---------------------------- |
|     ArrayList  | Fast access using index (`get(i)`) | Slow insert/delete in middle |
|   LinkedList   | Fast insert/delete anywhere        | Slow searching               |
*/

 /*
PART 1 – Scenario Based Analysis

1. Real-time chat message storage
   → LinkedList
   Reason: Frequent insertions, no need for random access
   Time Complexity: O(1) insertion

2. Music playlist where songs are frequently reordered
   → LinkedList
   Reason: Easy insertion/deletion without shifting elements

3. Student database with frequent searching by index
   → ArrayList
   Reason: Fast index-based access
   Time Complexity: O(1)

4. Browser back and forward navigation
   → LinkedList
   Reason: Easy add/remove from both ends

5. Online exam system storing answers sequentially
   → ArrayList
   Reason: Sequential storage, fast access, rare deletion
     */


    
}
