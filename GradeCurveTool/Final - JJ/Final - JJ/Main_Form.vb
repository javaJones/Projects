#Region "FINAL - JJ"

#Region "HEADER"
'NAME: JAMISON JONES
'DATE: 20APRIL2015
'PROJ: FINAL
'DESC: The app allows the users to open a file. The file will fill 
'      an array and then populate the combobox with students' names 
'      and grades. The app will apply a grade curve to the grades 
'      and display the student's new grade when selected from the list.
#End Region

#Region "OPTIONS"
Option Explicit On
Option Strict On
#End Region

Imports System.IO

#Region "MAIN"

Public Class Main_Form

#Region "STRUCTURE"
    'create the structure
    Private Structure GradeBook
        Dim FirstNameLastName As String
        Dim OriginalGrade As String
        Dim CurvedLetter As String
    End Structure
#End Region

#Region "ARRAY OF STRUCTURES"
    'create array of structure gradebook
    Dim Grades() As String
#End Region

#Region "EXIT"
    Private Sub Exit_Button_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Exit_Button.Click, FileExit_ToolStripMenuItem.Click
        'close the form
        Me.Close()

    End Sub
#End Region

#Region "PRINT"
    Private Sub Print_Button_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Print_Button.Click
        'print preview the form
        PrintForm1.Print()

    End Sub
#End Region

#Region "FILE OPEN"
    Sub FileOpen_ToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles FileOpen_ToolStripMenuItem.Click
        'handles the file open dialog and populates the combobox
        Dim ResponseDialogResult As DialogResult
        Dim fullRecord As String
        Dim totalGPTS As Integer = 0
        Dim i As Integer = 0
        Dim theMean As Double
        Dim studentGrade As Integer
        Dim STD_FirstStep As Double = 0
        Dim STD_SecondStep As Double
        Dim THE_STD As Double
        Dim ONE_MORE_STEP As Double
        Dim STD_Holder As Double


        'open the file here
        With OpenFileDialog1
            'open file dialog in current directory
            .InitialDirectory = Directory.GetCurrentDirectory
            'filter for just txt files
            OpenFileDialog1.Filter = "txt files (*.txt)|*.txt|All files (*.*)|*.*"
            OpenFileDialog1.FileName = ""
            .ShowDialog()

        End With

        'check to see it ok was clicked
        If ResponseDialogResult <> DialogResult.Cancel Then
            Try
                'open file 
                Dim sr As New StreamReader(OpenFileDialog1.FileName)
                Do Until sr.Peek = -1
                    fullRecord = sr.ReadLine()
                    Grades = fullRecord.Split(","c)
                    StudentName_ComboBox.Items.Add(Grades(0))
                    'accumulator for index and number of scores
                    i += 1
                    'total grade points used for mean
                    totalGPTS += Convert.ToInt32(Grades(1))
                    ReDim Preserve Grades(i)
                Loop
                'close the streamReader
                sr.Close()

                theMean = (totalGPTS / i)

                'Do Until Grades(ii) = i
                '    'fullRecord = sr.ReadLine()
                '    'Grades = fullRecord.Split(","c)
                '    'studentGrade = Convert.ToInt32(Grades(1))
                '    'STD_FirstStep = ((studentGrade - theMean) ^ 2)
                '    '    STD_Holder += STD_FirstStep
                '    ii += 1
                'Loop

                STD_SecondStep = i - 1
                ONE_MORE_STEP = (STD_Holder / STD_SecondStep)
                THE_STD = Math.Sqrt(ONE_MORE_STEP)

                'print to the textboxes
                NumGradeStat_TextBox.Text = i.ToString
                theMean = (totalGPTS / i)
                MeanGradeStat_TextBox.Text = theMean.ToString
                STDStat_TextBox.Text = THE_STD.ToString


                'exceptions for the try catch
            Catch ex As System.IO.FileLoadException
                MsgBox("A loading error occurred.")
            Catch ex As System.IO.IOException
                MsgBox("An error occurred")
            Catch ex As System.Exception
                MsgBox("An unspecified error occurred.")
            End Try

        End If

    End Sub
#End Region

#Region "ABOUT"
    Private Sub HelpAbout_ToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles HelpAbout_ToolStripMenuItem.Click
        'show the about form
        About_Form.ShowDialog()

    End Sub
#End Region

End Class

#End Region

#End Region


