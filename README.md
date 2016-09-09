# GCcontent

##Biological background:

1 计算GC含量的目的：The biological analog of identifying unknown text ariseswhen researchers encounter a molecule of DNA deriving
from an unknown species.Because of the base pairing relations of the two DNA strands, cytosine and guaninewill always appear in 
equal amounts in a double-stranded DNA molecule.Thus, to analyze the symbol frequencies of DNA for comparison against a database, 
we compute themolecule's GC-content, or the percentage of its bases that are either cytosine or guanine.~生词symbol frequency频数~

2 通过计算GC含量比较物种节省计算量：In practice, the GC-content of most eukaryotic genomes hovers around 50%. However, because 
genomes are so long, we may be able to distinguish species based on very small discrepanciesin GC-content; furthermore, most 
prokaryotes have a GC-content significantly higher than 50%,so that GC-content can be used to quickly differentiate many 
prokaryotes and eukaryotes by using relatively small DNA samples.~生词eukaryotic genomes真核基因组生物,prokaryotes原核生物~

##Problem:

The GC-content of a DNA string is given by the percentage of symbols in the string that are 'C' or 'G'. For example, the GC-content
of "AGCTATAG" is 37.5%. Note that the reverse complement of any DNA string has the same GC-content.
DNA strings must be labeled when they are consolidated into a database. A commonly used method of string labeling is called FASTA 
format. In this format, the string is introduced by a line that begins with '>', followed by some labeling information. Subsequent
lines contain the string itself; the first line to begin with '>' indicates the label of the next string.
In Rosalind's implementation, a string in FASTA format will be labeled by the ID "Rosalind_xxxx", where "xxxx" denotes a four-digit code between 0000 and 9999.

Given: At most 10 DNA strings in FASTA format (of length at most 1 kbp each).

Return: The ID of the string having the highest GC-content, followed by the GC-content of that string. Rosalind allows for a default error of 0.001 in all decimal answers unless otherwise stated; please see the note on absolute error below.
