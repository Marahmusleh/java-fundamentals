

## Linter Application for javascript files:
This application reads a javascript file and reads it all, and if the file contains an error, it will print "Missing semicolon." with the line number instead of the line content.

This is what is considered an error in this application if a line doesn't end with a ';', unless:

Won’t show an error if the line is empty.
Won’t show an error if the line ends with an opening curly brace '{'.
Won’t show an error if the line ends with a closing curly brace '}'.
Won’t show an error if the line contains if or else.

*When this app runs, it will print out the content of the javascript file, but replaces the lines containing an error with the line number and "Missing semicolon.".
