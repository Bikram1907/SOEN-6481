# SOEN-6481
Let there be a calculator that computes the value of certain established irrational
numbers. The purpose of the project is to carry out a number of activities, resulting in a
set of interrelated artifacts for the problem domain of such a calculator. In the rest of
the document, ETERNITY: NUMBERS stands for the name of both the project and the
product, unless otherwise stated.
The work on ETERNITY: NUMBERS has been organized into a number of constraints that
you need to observe during the project, and problems for which you need to provide
solutions. In some cases, a problem has a note associated with it, which is meant to serve
as a guide for scoping, understanding, and/or solving the problem. For the students to be
able to track their progress there are Progress (Visibility) Markers. For the sake of
identification, any communal work involving one or more members of your team has
been highlighted by an underline.
This document is subject to change at any time. You are expected to adapt to the
changes.
3. GENERAL
You are encouraged to use collaboration patterns in your interaction with the members
of your team.
There will be a need for proper technical writing in several places throughout the
duration of the project. Your writing must comply with an authoritative source on
technical writing. It is important not to make claims that cannot be substantiated.
Creativity is as important as correctness. (You can expect spelling errors, grammatical
errors, lack of clarity, over-writing, colloquial writing, unconvincing arguments, poor
organization, and poor formatting to be critical factors in marking.)
For any non-original work, your artifacts should have citations (and corresponding
references) in a ‘standard’ format at appropriate places. It is important not to copy
others’ work verbatim (100% identical) or almost verbatim (90% identical) regardless of
whether it is cited. (A work on the solution to any problem that is copied to any extent
from anywhere is considered equivalent to a non-submission for that problem.)
2
CONSTRAINT 1. [0 MARKS]
Each of your artifacts must be placed in a distributed version control system. You are
encouraged to use Git and its services, such as GitHub or GitLab, for hosting and issue
tracking. For regularity, at least one of your artifacts should evolve non-trivially, as
necessary, at least once a weekday (Monday to Friday).
Your artifacts should be accessible and their state should be visible at all times to the
instructor and to the teaching assistants. You should submit the address of your
workspace to all relevant parties by set date and include the address in your
documentation. (A non-submission of your address by given deadline, or a non-visibility
of your address for a notable period of time, will lead to an assignment of –10 marks.)
Progress (Visibility) Marker: July 05, 2019. An account on a DVCS has been set.
CONSTRAINT 2. [0 MARKS]
Your documentation must be typeset in LATEX report style. Your presentation must be
typeset in LATEX beamer style (or powerdot style). Any mathematical expressions must
be typeset in LATEX, and not included as images. Submit both *.tex and *.pdf of
your documentation and your presentation. (A non-submission by given deadline, or a
submission that either does not process, or a submission of documentation not in
LATEX, or not in the LATEX report style, will lead to an assignment of –10 marks.)
Progress (Visibility) Marker: July 12, 2019. LATEX necessary for the project has been
learned.
4. SPECIFIC
An irrational number is a real number that is not a rational number, that is, it is not
possible to express an irrational number as a quotient of two integers.
You will be assigned an irrational number pseudo-randomly at an appropriate time. This
number will be unique across your team and will be from the following list:
 N1: Champernowne Constant (C10)
 N2: Euler’s Number (e)
 N3: Gaussian Integral (√π)
 N4: Gelfond’s Constant (eπ
)
 N5: Golden Ratio (φ)
 N6: Liouville Constant (c)
 N7: Natural Logarithm of 2 (lne(2))
 N8: Pi (π)
 N9: Silver Ratio (δS)
 N10: Universal Parabolic Constant (P2)
 N11: Plastic Number (ρ)
 N12: Hilbert Number (2√2
) 
3
(N1 – N12 are identifiers for the sake of reference.)
PROBLEM 1. [20 MARKS]
Give a brief description, not exceeding one page, of your number, including the
characteristics that make it unique. To ensure that you have attained sufficient
background, Test 1 will have a problem related to your number. (A non-submission by
given deadline will lead to an assignment of –20 marks for this problem to you.)
Progress (Visibility) Marker: July 05, 2019. The number has been researched, read about,
and understood.
PROBLEM 2. [20 MARKS]
Find a suitable interviewee. Rationalize briefly the choice of your interviewee. Prepare
interview questions together and conduct an interview of a potential user of ETERNITY:
NUMBERS. You could focus specifically on the possible uses of your number, by itself, or
in combination with other numbers, or as a result of carrying out certain mathematical
operations on the number, or as a result of carrying out certain mathematical operations
on the number in combination with other numbers. Submit your interview questions,
responses to the interview questions, and your analysis of the interview.
Collaborate with your team members to ensure that your interviewee is unique across the
team. (A non-submission by given deadline will lead to an assignment of –20 marks for
this problem to you. An identical interviewee will lead to an assignment of –20 marks for
this problem to you.)
Progress (Visibility) Marker: July 12, 2019. The interview has been carried out.
PROBLEM 3. [20 MARKS]
Collaboratively brainstorm and mind map with your team members to decide a persona
template. The persona template must be identical across the team. Create a persona based
on your analysis of the interview. (A non-submission by given deadline will lead to an
assignment of –20 marks for this problem to you. A non-identical persona template will
lead to a deduction of 10 marks for this problem for you and for other members of your
team.)
4
Progress (Visibility) Marker: July 19, 2019. Persona template has been agreed upon and
persona has been described.
PROBLEM 4. [40 MARKS]
Elicit, decide, and describe each relevant concept for your ETERNITY: NUMBERS. Elicit,
decide, and describe each relevant relationship between the concepts ETERNITY:
NUMBERS. Using UML, construct a problem domain model for your ETERNITY:
NUMBERS. (A non-submission by given deadline will lead to an assignment of –40 marks
for this problem to you.)
NOTE
The concerns outside the scope of the ETERNITY: NUMBERS should be, if necessary,
included as an abstraction and their details should be ignored subsequently.
Progress (Visibility) Marker: July 19, 2019. The problem domain model has been
constructed.
PROBLEM 5. [50 MARKS]
Elicit, decide, and describe each use case of the ETERNITY: NUMBERS. Using UML,
construct two different views of a use case model. You could focus specifically on the
possible uses of your number, by itself or as a result of carrying out certain mathematical
operations on the number. Furthermore, using UML, express the normal scenario of
each use case in ETERNITY: NUMBERS. (A non-submission by given deadline will lead
to an assignment of –50 marks for this problem to you.)
NOTE
The behavioral concerns internal to the ETERNITY: NUMBERS should be ignored.
Progress (Visibility) Marker: July 19, 2019. The use case model has been constructed. 
5
PROBLEM 6. [60 MARKS]
For your persona, elicit, decide, and create a set of user stories for your ETERNITY:
NUMBERS. The constraints can be either local (that is, on a single user story) or global
(that is, on multiple user stories).
The constraints must, as appropriate, highlight for your ETERNITY: NUMBERS-related
product quality concerns. For example, such constraints could be maintainabilityspecific and/or usability-specific.
Each user story must be associated with a priority, estimate (in story points), as well as
with one or more acceptance tests. Each user story must be identifiable, atomic,
consistent (with respect to other user stories), implementable, validatable, and
verifiable. Each user story must also aim to minimize the potential for ambiguity and
indeterminacy. (A non-submission by given deadline will lead to an assignment of –60
marks for this problem to you.)
Progress (Visibility) Marker: July 26, 2019. The user stories are created.
PROBLEM 7. [10 MARKS]
Create a backward traceability matrix for your ETERNITY: NUMBERS. This
traceability matrix must have at least two columns, one for each user story, and the other
for one or more sources from which the user story was elicited.
For a given user story, a ‘source’ could be another user story, one of the other artifacts of
ETERNITY: NUMBERS, a person, or some literature, preferably reachable via the
Internet. (A non-submission by given deadline will lead to an assignment of –10 marks
for this problem to you.)
Progress (Visibility) Marker: July 26, 2019. The user stories are traced.
PROBLEM 8. [50 MARKS]
Implement the user stories assigned to you from scratch in Java. The user stories
assigned to you will be a subset of the user stories submitted by you. The term “scratch”
means that, apart from the numbers related to input, output, and arithmetic, your
implementation is prohibited from using any built-in functions provided by Java. 
6
Submit your source code (*.java files), data files, if any, and the executable (*.jar).
(A non-submission by given deadline, or a submission that either does not compile or
does not execute, will lead to an assignment of –50 marks for this problem to you.)
Progress (Visibility) Marker: August 02, 2019. The user stories are implemented.
PROBLEM 9. [30 MARKS]
Give a presentation of your retrospective. Present any critical decisions made during the
project, and explain briefly why those decisions were critical. Present any lessons learnt
by doing the project, especially those from reviewing and testing by your team member.
Your ability to provide convincing answers to questions will be a critical factor in
marking. (A non-attendance will lead to an assignment of –30 marks for this problem to
you.) 
