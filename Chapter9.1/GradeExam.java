public class GradeExam {
    public static void main(String[] args) {
    
        // Students answers
        char[][] answers = {{'A','B','A','C','C','D','E','E','A','D'},
                            {'D','B','A','B','C','A','E','E','A','D'},
                            {'E','D','D','A','C','B','E','E','A','D'},
                            {'C','B','A','E','D','C','E','E','A','D'},
                            {'A','B','D','C','C','D','E','E','A','D'},
                            {'B','B','E','C','C','D','E','E','A','D'},
                            {'B','B','A','C','C','D','E','E','A','D'},
                            {'E','B','E','C','C','D','E','E','A','D'}};

                            char[] keys = {'D','B','D','C','C','D','A','E','A','D'};

        for(int i=0; i< answers.length;i++){
            int correctanswers = 0;
            for(int col = 0; col < answers[0].length;col++){
                if(answers[i][col]==keys[col]){
                    correctanswers++;
                }
            }
            System.out.println("Student"+ i+"'s correct count is "+ correctanswers);
        }
    }
    
}
