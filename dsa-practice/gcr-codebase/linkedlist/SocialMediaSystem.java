//node to store Friend ID list (nested singly linked list)
class Friend {
    int friendId;
    Friend next;

    Friend(int friendId) {
        this.friendId = friendId;
        this.next = null;
    }
}
class UserNode {
    int userId;
    String name;
    int age;
    Friend friendsHead;   // head of friend list
    UserNode next;            // pointer to next user

    UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendsHead = null;
        this.next = null;
    }

    void addFriend(int friendId) {
        Friend node = new Friend(friendId);
        node.next = friendsHead;
        friendsHead = node;
    }

    //remove friend ID from user friend list
    void removeFriend(int friendId) {
        if (friendsHead == null) return;

        if (friendsHead.friendId == friendId) {
            friendsHead = friendsHead.next;
            return;
        }

        Friend temp = friendsHead;
        while (temp.next != null && temp.next.friendId != friendId) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    void displayFriends() {
        System.out.print("Friends of " + name + ": ");
        Friend temp = friendsHead;

        if (temp == null) {
            System.out.println("No friends");
            return;
        }

        while (temp != null) {
            System.out.print(temp.friendId + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    //count number of friends
    int countFriends() {
        int count = 0;
        Friend temp = friendsHead;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}

// Social Media system using singly linked list
class SocialMedia {

    private UserNode head;  

    void addUser(int id, String name, int age) {
        UserNode node = new UserNode(id, name, age);
        node.next = head;
        head = node;
    }

    UserNode findUserById(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    // Find user by Name
    UserNode findUserByName(String name) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name))
                return temp;
            temp = temp.next;
        }
        return null;
    }

    // Add friend connection 
    void addFriendConnection(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) return;

        u1.addFriend(id2);
        u2.addFriend(id1);
    }

    // Remove friend connection 
    void removeFriendConnection(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) return;

        u1.removeFriend(id2);
        u2.removeFriend(id1);
    }

    // Find mutual friends between two users
    void findMutualFriends(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) return;

        System.out.print("Mutual friends of " + u1.name + " and " + u2.name + ": ");

        Friend f1 = u1.friendsHead;
        boolean found = false;

        while (f1 != null) {
            Friend f2 = u2.friendsHead;
            while (f2 != null) {
                if (f1.friendId == f2.friendId) {
                    System.out.print(f1.friendId + " ");
                    found = true;
                }
                f2 = f2.next;
            }
            f1 = f1.next;
        }

        if (!found)
            System.out.print("None");

        System.out.println();
    }

    // Display all users and their friend count
    void displayUsers() {
        UserNode temp = head;
        System.out.println("UserID\tName\tAge\tFriends");
        while (temp != null) {
            System.out.println(temp.userId + "\t" + temp.name + "\t" +
                    temp.age + "\t" + temp.countFriends());
            temp = temp.next;
        }
    }
}

public class SocialMediaSystem {

    public static void main(String[] args) {

        SocialMedia sm = new SocialMedia();

    
        sm.addUser(1, "Abhay", 22);
        sm.addUser(2, "Abhinav", 21);
        sm.addUser(3, "Jyotika", 21);
        sm.addUser(4, "Nistha", 20);

        sm.addFriendConnection(1, 2);
        sm.addFriendConnection(1, 3);
        sm.addFriendConnection(2, 3);
        sm.addFriendConnection(3, 4);

        sm.displayUsers();

        sm.findUserById(1).displayFriends();

        // Mutual friends
        sm.findMutualFriends(1, 2);

        // Remove friend connection
        sm.removeFriendConnection(1, 2);

        // After removal
        sm.findUserById(1).displayFriends();
        sm.findUserById(2).displayFriends();
    }
}
