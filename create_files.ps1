$topics = @(
    @{Module="01"; Topic="01"; Name="Introduction"; Type="Notes"},
    @{Module="01"; Topic="02"; Name="Variables"; Type="Notes"},
    @{Module="01"; Topic="03"; Name="User_Input"; Type="Notes"},
    @{Module="01"; Topic="04"; Name="MadLibs"; Type="Project"},
    @{Module="01"; Topic="05"; Name="Arithmetic"; Type="Notes"},
    @{Module="01"; Topic="06"; Name="ShoppingCart"; Type="Project"},
    @{Module="02"; Topic="07"; Name="If_Statements"; Type="Notes"},
    @{Module="02"; Topic="08"; Name="Random_Numbers"; Type="Notes"},
    @{Module="02"; Topic="09"; Name="Math_Class"; Type="Notes"},
    @{Module="02"; Topic="10"; Name="Printf"; Type="Notes"},
    @{Module="02"; Topic="11"; Name="CompoundInterest"; Type="Project"},
    @{Module="02"; Topic="12"; Name="Nested_If_Statements"; Type="Notes"},
    @{Module="03"; Topic="13"; Name="String_Methods"; Type="Notes"},
    @{Module="03"; Topic="14"; Name="Substrings"; Type="Notes"},
    @{Module="03"; Topic="15"; Name="WeightConverter"; Type="Project"},
    @{Module="03"; Topic="16"; Name="Ternary_Operator"; Type="Notes"},
    @{Module="03"; Topic="17"; Name="TemperatureConverter"; Type="Project"},
    @{Module="03"; Topic="18"; Name="Enhanced_Switches"; Type="Notes"},
    @{Module="03"; Topic="19"; Name="Calculator"; Type="Project"},
    @{Module="03"; Topic="20"; Name="Logical_Operators"; Type="Notes"},
    @{Module="04"; Topic="21"; Name="While_Loops"; Type="Notes"},
    @{Module="04"; Topic="22"; Name="NumberGuessingGame"; Type="Project"},
    @{Module="04"; Topic="23"; Name="For_Loops"; Type="Notes"},
    @{Module="04"; Topic="24"; Name="Break_and_Continue"; Type="Notes"},
    @{Module="04"; Topic="25"; Name="Nested_Loops"; Type="Notes"},
    @{Module="05"; Topic="26"; Name="Methods"; Type="Notes"},
    @{Module="05"; Topic="27"; Name="Overloaded_Methods"; Type="Notes"},
    @{Module="05"; Topic="28"; Name="Variable_Scope"; Type="Notes"},
    @{Module="05"; Topic="29"; Name="BankingProgram"; Type="Project"},
    @{Module="05"; Topic="30"; Name="DiceRoller"; Type="Project"},
    @{Module="06"; Topic="31"; Name="Arrays"; Type="Notes"},
    @{Module="06"; Topic="32"; Name="User_Input_Into_Array"; Type="Notes"},
    @{Module="06"; Topic="33"; Name="Search_An_Array"; Type="Notes"},
    @{Module="06"; Topic="34"; Name="Varargs"; Type="Notes"},
    @{Module="06"; Topic="35"; Name="2D_Arrays"; Type="Notes"},
    @{Module="06"; Topic="36"; Name="QuizGame"; Type="Project"},
    @{Module="06"; Topic="37"; Name="RockPaperScissors"; Type="Project"},
    @{Module="06"; Topic="38"; Name="SlotMachine"; Type="Project"},
    @{Module="07"; Topic="39"; Name="OOP_Introduction"; Type="Notes"},
    @{Module="07"; Topic="40"; Name="Constructors"; Type="Notes"},
    @{Module="07"; Topic="41"; Name="Overloaded_Constructors"; Type="Notes"},
    @{Module="07"; Topic="42"; Name="Array_of_Objects"; Type="Notes"},
    @{Module="07"; Topic="43"; Name="Static"; Type="Notes"},
    @{Module="07"; Topic="44"; Name="Inheritance"; Type="Notes"},
    @{Module="07"; Topic="45"; Name="Super"; Type="Notes"},
    @{Module="07"; Topic="46"; Name="Method_Overriding"; Type="Notes"},
    @{Module="07"; Topic="47"; Name="ToString_Method"; Type="Notes"},
    @{Module="07"; Topic="48"; Name="Abstraction"; Type="Notes"},
    @{Module="07"; Topic="49"; Name="Interfaces"; Type="Notes"},
    @{Module="07"; Topic="50"; Name="Polymorphism"; Type="Notes"},
    @{Module="07"; Topic="51"; Name="Runtime_Polymorphism"; Type="Notes"},
    @{Module="07"; Topic="52"; Name="Getters_and_Setters"; Type="Notes"},
    @{Module="07"; Topic="53"; Name="Aggregation"; Type="Notes"},
    @{Module="07"; Topic="54"; Name="Composition"; Type="Notes"},
    @{Module="08"; Topic="55"; Name="Wrapper_Classes"; Type="Notes"},
    @{Module="08"; Topic="56"; Name="ArrayLists"; Type="Notes"},
    @{Module="08"; Topic="57"; Name="Exception_Handling"; Type="Notes"},
    @{Module="08"; Topic="58"; Name="Write_Files"; Type="Notes"},
    @{Module="08"; Topic="59"; Name="Read_Files"; Type="Notes"},
    @{Module="08"; Topic="60"; Name="MusicPlayer"; Type="Project"},
    @{Module="08"; Topic="61"; Name="HangmanGame"; Type="Project"},
    @{Module="08"; Topic="62"; Name="Dates_and_Times"; Type="Notes"},
    @{Module="08"; Topic="63"; Name="Anonymous_Classes"; Type="Notes"},
    @{Module="08"; Topic="64"; Name="TimerTasks"; Type="Notes"},
    @{Module="08"; Topic="65"; Name="CountdownTimer"; Type="Project"},
    @{Module="09"; Topic="66"; Name="Generics"; Type="Notes"},
    @{Module="09"; Topic="67"; Name="HashMaps"; Type="Notes"},
    @{Module="09"; Topic="68"; Name="Enums"; Type="Notes"},
    @{Module="09"; Topic="69"; Name="Threading"; Type="Notes"},
    @{Module="09"; Topic="70"; Name="Multithreading"; Type="Notes"},
    @{Module="09"; Topic="71"; Name="AlarmClock"; Type="Project"}
)

foreach ($topic in $topics) {
    $module = $topic.Module
    $topicNum = $topic.Topic
    $name = $topic.Name
    $type = $topic.Type
    
    $folder = "Module_$module"
    $subfolder = "$topicNum_$name"
    
    if ($type -eq "Notes") {
        $filename = "Notes_$name.java"
        $content = @"
/*
 * ============================================================
 *  $name IN JAVA  |  Module $module  |  Topic $topicNum
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  [Brief description of the topic]
 *
 *  WHY DO WE NEED THIS?
 *  [Why this topic matters]
 *
 *  HOW TO READ THIS FILE:
 *  - Read each section top to bottom
 *  - Every line has a comment explaining what it does
 *  - Try changing the values and re-running to experiment
 *  - After reading, go to Exercise_$name.java and try it yourself
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #$topicNum at timestamp
 * ============================================================
 */

public class Notes_$name {
    public static void main(String[] args) {
        // Basic example code here
        System.out.println("This is Notes_$name");
    }
}

// ── KEY TAKEAWAYS ──────────────────────────────────────────
// 1. [Key point 1]
// 2. [Key point 2]

// ── NEXT STEP ──────────────────────────────────────────────
// Now open Exercise_$name.java and complete the exercises!
"@
    } elseif ($type -eq "Project") {
        $filename = "$name.java"
        $content = @"
/*
 * ============================================================
 *  PROJECT: $name  |  Module $module  |  Topic $topicNum
 * ============================================================
 *  WHAT IS THIS PROJECT?
 *  [Project description]
 *
 *  WHAT YOU WILL LEARN:
 *  - [Learning objectives]
 *
 *  HOW TO RUN:
 *  1. Compile: javac $name.java
 *  2. Run: java $name
 * ============================================================
 */

public class $name {
    public static void main(String[] args) {
        // Project code here
        System.out.println("This is $name project");
    }
}
"@
    }
    
    $path = "$folder\$subfolder\$filename"
    New-Item -ItemType File -Path $path -Force
    $content | Out-File -FilePath $path -Encoding UTF8
}

# Now create Exercise files for Notes topics
$exerciseTopics = $topics | Where-Object { $_.Type -eq "Notes" }

foreach ($topic in $exerciseTopics) {
    $module = $topic.Module
    $topicNum = $topic.Topic
    $name = $topic.Name
    
    $folder = "Module_$module"
    $subfolder = "$topicNum_$name"
    $filename = "Exercise_$name.java"
    
    $content = @"
/*
 * ============================================================
 *  EXERCISES  |  $name IN JAVA  |  Module $module
 * ============================================================
 *  INSTRUCTIONS:
 *  - Complete each exercise below
 *  - Each exercise has a clear comment telling you what to do
 *  - The expected output is shown in a comment above each task
 *  - Try to solve it WITHOUT looking at the Notes file first!
 *  - If you get stuck, look at Notes_$name.java for help
 *
 *  DIFFICULTY LEVELS:
 *  ⭐         = Beginner (just follow the pattern from notes)
 *  ⭐⭐       = Intermediate (think a little)
 *  ⭐⭐⭐     = Challenge (push yourself!)
 * ============================================================
 */

public class Exercise_$name {
    public static void main(String[] args) {

        // ── EXERCISE 1 ⭐ ──────────────────────────────────────
        // Task: [Exercise description]
        // Expected output: [Expected result]
        // Your code here:
        // TODO: [Hint]

        // ── EXERCISE 2 ⭐⭐ ────────────────────────────────────
        // Task: [Exercise description]
        // Expected output: [Expected result]
        // Your code here:
        // TODO: [Hint]

        // ── EXERCISE 3 ⭐⭐⭐ ──────────────────────────────────
        // Task: [Exercise description]
        // Expected output: [Expected result]
        // Your code here:
        // TODO: [Hint]

    }
}
"@
    
    $path = "$folder\$subfolder\$filename"
    New-Item -ItemType File -Path $path -Force
    $content | Out-File -FilePath $path -Encoding UTF8
}