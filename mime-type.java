/**
* Input
* Line 1: Number N of elements which make up the association table.
* 
* Line 2: Number Q of file names to be analyzed.
* 
* N following lines: One file extension per line and the corresponding MIME type (separated by a blank space).
* 
* Q following lines: One file name per line.
* 
* Output
* For each of the Q filenames, display on a line the corresponding MIME type. If there is no corresponding type, then display UNKNOWN.
* Constraints
* 0 < N < 10000 
* 0 < Q < 10000
* File extensions are composed of a maximum of 10 alphanumerical ASCII characters.
* MIME types are composed of a maximum 50 alphanumerical and punctuation ASCII characters.
* File names are composed of a maximum of 256 alphanumerical ASCII characters and dots (full stops).
* There are no spaces in the file names, extensions or MIME types.
* 
**/

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int types_n = in.nextInt();
        int files_n = in.nextInt();
        
        Map<String, String> map = new HashMap<String, String>();
        
        for (int i = 0; i < types_n; i++) { map.put(in.next().toLowerCase(), in.next()); in.nextLine(); }
        
        for (int i = 0; i < files_n; i++) 
        {
            String FNAME = in.nextLine().toLowerCase(); // One file name per line.
            int dotIndex = FNAME.lastIndexOf(".");
            String ext = dotIndex == -1 ? "" : FNAME.substring(dotIndex+1);
            System.out.println(map.containsKey(ext) ?  map.get(ext) : "UNKNOWN");
        }
    }
}
