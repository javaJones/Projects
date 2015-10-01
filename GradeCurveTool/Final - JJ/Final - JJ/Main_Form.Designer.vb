<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Main_Form
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.components = New System.ComponentModel.Container()
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Main_Form))
        Me.MenuStrip1 = New System.Windows.Forms.MenuStrip()
        Me.File_ToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.FileOpen_ToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.ToolStripMenuItem1 = New System.Windows.Forms.ToolStripSeparator()
        Me.FileExit_ToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.Help_ToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.HelpAbout_ToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.Author_Label = New System.Windows.Forms.Label()
        Me.StudentName_ComboBox = New System.Windows.Forms.ComboBox()
        Me.Statistic_GroupBox = New System.Windows.Forms.GroupBox()
        Me.Curved_Label = New System.Windows.Forms.Label()
        Me.STDStat_TextBox = New System.Windows.Forms.TextBox()
        Me.Grade_Label = New System.Windows.Forms.Label()
        Me.Mean_Label = New System.Windows.Forms.Label()
        Me.MeanGradeStat_TextBox = New System.Windows.Forms.TextBox()
        Me.NumGradeStat_TextBox = New System.Windows.Forms.TextBox()
        Me.Print_Button = New System.Windows.Forms.Button()
        Me.Exit_Button = New System.Windows.Forms.Button()
        Me.PrintForm1 = New Microsoft.VisualBasic.PowerPacks.Printing.PrintForm(Me.components)
        Me.OpenFileDialog1 = New System.Windows.Forms.OpenFileDialog()
        Me.Orginal_Label = New System.Windows.Forms.Label()
        Me.CurvedGrade_Label = New System.Windows.Forms.Label()
        Me.OriginalScore_TextBox = New System.Windows.Forms.TextBox()
        Me.CurvedGrade_TextBox = New System.Windows.Forms.TextBox()
        Me.ToolTip1 = New System.Windows.Forms.ToolTip(Me.components)
        Me.MenuStrip1.SuspendLayout()
        Me.Statistic_GroupBox.SuspendLayout()
        Me.SuspendLayout()
        '
        'MenuStrip1
        '
        Me.MenuStrip1.Items.AddRange(New System.Windows.Forms.ToolStripItem() {Me.File_ToolStripMenuItem, Me.Help_ToolStripMenuItem})
        Me.MenuStrip1.Location = New System.Drawing.Point(0, 0)
        Me.MenuStrip1.Name = "MenuStrip1"
        Me.MenuStrip1.Size = New System.Drawing.Size(491, 24)
        Me.MenuStrip1.TabIndex = 0
        Me.MenuStrip1.Text = "MenuStrip1"
        '
        'File_ToolStripMenuItem
        '
        Me.File_ToolStripMenuItem.DropDownItems.AddRange(New System.Windows.Forms.ToolStripItem() {Me.FileOpen_ToolStripMenuItem, Me.ToolStripMenuItem1, Me.FileExit_ToolStripMenuItem})
        Me.File_ToolStripMenuItem.Name = "File_ToolStripMenuItem"
        Me.File_ToolStripMenuItem.Size = New System.Drawing.Size(37, 20)
        Me.File_ToolStripMenuItem.Text = "&File"
        '
        'FileOpen_ToolStripMenuItem
        '
        Me.FileOpen_ToolStripMenuItem.Name = "FileOpen_ToolStripMenuItem"
        Me.FileOpen_ToolStripMenuItem.ShortcutKeys = CType((System.Windows.Forms.Keys.Control Or System.Windows.Forms.Keys.O), System.Windows.Forms.Keys)
        Me.FileOpen_ToolStripMenuItem.Size = New System.Drawing.Size(155, 22)
        Me.FileOpen_ToolStripMenuItem.Text = "&Open..."
        '
        'ToolStripMenuItem1
        '
        Me.ToolStripMenuItem1.Name = "ToolStripMenuItem1"
        Me.ToolStripMenuItem1.Size = New System.Drawing.Size(152, 6)
        '
        'FileExit_ToolStripMenuItem
        '
        Me.FileExit_ToolStripMenuItem.Name = "FileExit_ToolStripMenuItem"
        Me.FileExit_ToolStripMenuItem.ShortcutKeys = CType((System.Windows.Forms.Keys.Alt Or System.Windows.Forms.Keys.F4), System.Windows.Forms.Keys)
        Me.FileExit_ToolStripMenuItem.Size = New System.Drawing.Size(155, 22)
        Me.FileExit_ToolStripMenuItem.Text = "E&xit"
        '
        'Help_ToolStripMenuItem
        '
        Me.Help_ToolStripMenuItem.DropDownItems.AddRange(New System.Windows.Forms.ToolStripItem() {Me.HelpAbout_ToolStripMenuItem})
        Me.Help_ToolStripMenuItem.Name = "Help_ToolStripMenuItem"
        Me.Help_ToolStripMenuItem.ShortcutKeys = CType((System.Windows.Forms.Keys.Control Or System.Windows.Forms.Keys.H), System.Windows.Forms.Keys)
        Me.Help_ToolStripMenuItem.Size = New System.Drawing.Size(44, 20)
        Me.Help_ToolStripMenuItem.Text = "&Help"
        '
        'HelpAbout_ToolStripMenuItem
        '
        Me.HelpAbout_ToolStripMenuItem.Name = "HelpAbout_ToolStripMenuItem"
        Me.HelpAbout_ToolStripMenuItem.ShortcutKeys = CType(((System.Windows.Forms.Keys.Control Or System.Windows.Forms.Keys.Shift) _
                    Or System.Windows.Forms.Keys.A), System.Windows.Forms.Keys)
        Me.HelpAbout_ToolStripMenuItem.Size = New System.Drawing.Size(181, 22)
        Me.HelpAbout_ToolStripMenuItem.Text = "&About"
        '
        'Author_Label
        '
        Me.Author_Label.AutoSize = True
        Me.Author_Label.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Author_Label.Location = New System.Drawing.Point(178, 278)
        Me.Author_Label.Name = "Author_Label"
        Me.Author_Label.Size = New System.Drawing.Size(135, 20)
        Me.Author_Label.TabIndex = 1
        Me.Author_Label.Text = "by Jamison Jones"
        '
        'StudentName_ComboBox
        '
        Me.StudentName_ComboBox.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList
        Me.StudentName_ComboBox.FormattingEnabled = True
        Me.StudentName_ComboBox.Location = New System.Drawing.Point(277, 136)
        Me.StudentName_ComboBox.Name = "StudentName_ComboBox"
        Me.StudentName_ComboBox.Size = New System.Drawing.Size(136, 21)
        Me.StudentName_ComboBox.TabIndex = 2
        '
        'Statistic_GroupBox
        '
        Me.Statistic_GroupBox.Controls.Add(Me.Curved_Label)
        Me.Statistic_GroupBox.Controls.Add(Me.STDStat_TextBox)
        Me.Statistic_GroupBox.Controls.Add(Me.Grade_Label)
        Me.Statistic_GroupBox.Controls.Add(Me.Mean_Label)
        Me.Statistic_GroupBox.Controls.Add(Me.MeanGradeStat_TextBox)
        Me.Statistic_GroupBox.Controls.Add(Me.NumGradeStat_TextBox)
        Me.Statistic_GroupBox.Location = New System.Drawing.Point(0, 27)
        Me.Statistic_GroupBox.Name = "Statistic_GroupBox"
        Me.Statistic_GroupBox.Size = New System.Drawing.Size(491, 88)
        Me.Statistic_GroupBox.TabIndex = 3
        Me.Statistic_GroupBox.TabStop = False
        Me.Statistic_GroupBox.Text = "Statistics"
        '
        'Curved_Label
        '
        Me.Curved_Label.AutoSize = True
        Me.Curved_Label.Location = New System.Drawing.Point(334, 28)
        Me.Curved_Label.Name = "Curved_Label"
        Me.Curved_Label.Size = New System.Drawing.Size(98, 13)
        Me.Curved_Label.TabIndex = 6
        Me.Curved_Label.Text = "Standard Deviation"
        '
        'STDStat_TextBox
        '
        Me.STDStat_TextBox.Location = New System.Drawing.Point(334, 44)
        Me.STDStat_TextBox.Name = "STDStat_TextBox"
        Me.STDStat_TextBox.ReadOnly = True
        Me.STDStat_TextBox.Size = New System.Drawing.Size(100, 20)
        Me.STDStat_TextBox.TabIndex = 9
        Me.STDStat_TextBox.TabStop = False
        Me.STDStat_TextBox.TextAlign = System.Windows.Forms.HorizontalAlignment.Right
        Me.ToolTip1.SetToolTip(Me.STDStat_TextBox, "The standard deviation of the grades accumulated.")
        '
        'Grade_Label
        '
        Me.Grade_Label.AutoSize = True
        Me.Grade_Label.Location = New System.Drawing.Point(57, 28)
        Me.Grade_Label.Name = "Grade_Label"
        Me.Grade_Label.Size = New System.Drawing.Size(63, 13)
        Me.Grade_Label.TabIndex = 4
        Me.Grade_Label.Text = "# of Grades"
        '
        'Mean_Label
        '
        Me.Mean_Label.AutoSize = True
        Me.Mean_Label.Location = New System.Drawing.Point(198, 28)
        Me.Mean_Label.Name = "Mean_Label"
        Me.Mean_Label.Size = New System.Drawing.Size(83, 13)
        Me.Mean_Label.TabIndex = 5
        Me.Mean_Label.Text = "Mean of Grades"
        '
        'MeanGradeStat_TextBox
        '
        Me.MeanGradeStat_TextBox.Location = New System.Drawing.Point(191, 44)
        Me.MeanGradeStat_TextBox.Name = "MeanGradeStat_TextBox"
        Me.MeanGradeStat_TextBox.ReadOnly = True
        Me.MeanGradeStat_TextBox.Size = New System.Drawing.Size(100, 20)
        Me.MeanGradeStat_TextBox.TabIndex = 8
        Me.MeanGradeStat_TextBox.TabStop = False
        Me.MeanGradeStat_TextBox.TextAlign = System.Windows.Forms.HorizontalAlignment.Right
        Me.ToolTip1.SetToolTip(Me.MeanGradeStat_TextBox, "The average of all of the grades found.")
        '
        'NumGradeStat_TextBox
        '
        Me.NumGradeStat_TextBox.Location = New System.Drawing.Point(56, 44)
        Me.NumGradeStat_TextBox.Name = "NumGradeStat_TextBox"
        Me.NumGradeStat_TextBox.ReadOnly = True
        Me.NumGradeStat_TextBox.Size = New System.Drawing.Size(100, 20)
        Me.NumGradeStat_TextBox.TabIndex = 7
        Me.NumGradeStat_TextBox.TabStop = False
        Me.NumGradeStat_TextBox.TextAlign = System.Windows.Forms.HorizontalAlignment.Right
        Me.ToolTip1.SetToolTip(Me.NumGradeStat_TextBox, "Total number of grades found.")
        '
        'Print_Button
        '
        Me.Print_Button.Location = New System.Drawing.Point(78, 136)
        Me.Print_Button.Name = "Print_Button"
        Me.Print_Button.Size = New System.Drawing.Size(75, 23)
        Me.Print_Button.TabIndex = 4
        Me.Print_Button.Text = "&Print"
        Me.ToolTip1.SetToolTip(Me.Print_Button, "Print the current form.")
        Me.Print_Button.UseVisualStyleBackColor = True
        '
        'Exit_Button
        '
        Me.Exit_Button.DialogResult = System.Windows.Forms.DialogResult.Cancel
        Me.Exit_Button.Location = New System.Drawing.Point(78, 165)
        Me.Exit_Button.Name = "Exit_Button"
        Me.Exit_Button.Size = New System.Drawing.Size(75, 23)
        Me.Exit_Button.TabIndex = 5
        Me.Exit_Button.Text = "E&xit"
        Me.ToolTip1.SetToolTip(Me.Exit_Button, "Exit the application.")
        Me.Exit_Button.UseVisualStyleBackColor = True
        '
        'PrintForm1
        '
        Me.PrintForm1.DocumentName = "document"
        Me.PrintForm1.Form = Me
        Me.PrintForm1.PrintAction = System.Drawing.Printing.PrintAction.PrintToPreview
        Me.PrintForm1.PrinterSettings = CType(resources.GetObject("PrintForm1.PrinterSettings"), System.Drawing.Printing.PrinterSettings)
        Me.PrintForm1.PrintFileName = Nothing
        '
        'OpenFileDialog1
        '
        Me.OpenFileDialog1.FileName = "OpenFileDialog1"
        '
        'Orginal_Label
        '
        Me.Orginal_Label.AutoSize = True
        Me.Orginal_Label.Location = New System.Drawing.Point(195, 184)
        Me.Orginal_Label.Name = "Orginal_Label"
        Me.Orginal_Label.Size = New System.Drawing.Size(76, 13)
        Me.Orginal_Label.TabIndex = 7
        Me.Orginal_Label.Text = "Original Score:"
        '
        'CurvedGrade_Label
        '
        Me.CurvedGrade_Label.AutoSize = True
        Me.CurvedGrade_Label.Location = New System.Drawing.Point(195, 219)
        Me.CurvedGrade_Label.Name = "CurvedGrade_Label"
        Me.CurvedGrade_Label.Size = New System.Drawing.Size(76, 13)
        Me.CurvedGrade_Label.TabIndex = 8
        Me.CurvedGrade_Label.Text = "Curved Grade:"
        '
        'OriginalScore_TextBox
        '
        Me.OriginalScore_TextBox.Location = New System.Drawing.Point(277, 177)
        Me.OriginalScore_TextBox.Name = "OriginalScore_TextBox"
        Me.OriginalScore_TextBox.ReadOnly = True
        Me.OriginalScore_TextBox.Size = New System.Drawing.Size(136, 20)
        Me.OriginalScore_TextBox.TabIndex = 10
        Me.OriginalScore_TextBox.TabStop = False
        Me.OriginalScore_TextBox.TextAlign = System.Windows.Forms.HorizontalAlignment.Center
        '
        'CurvedGrade_TextBox
        '
        Me.CurvedGrade_TextBox.Location = New System.Drawing.Point(277, 212)
        Me.CurvedGrade_TextBox.Name = "CurvedGrade_TextBox"
        Me.CurvedGrade_TextBox.ReadOnly = True
        Me.CurvedGrade_TextBox.Size = New System.Drawing.Size(136, 20)
        Me.CurvedGrade_TextBox.TabIndex = 11
        Me.CurvedGrade_TextBox.TabStop = False
        Me.CurvedGrade_TextBox.TextAlign = System.Windows.Forms.HorizontalAlignment.Center
        '
        'Main_Form
        '
        Me.AcceptButton = Me.Print_Button
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.CancelButton = Me.Exit_Button
        Me.ClientSize = New System.Drawing.Size(491, 307)
        Me.Controls.Add(Me.CurvedGrade_TextBox)
        Me.Controls.Add(Me.OriginalScore_TextBox)
        Me.Controls.Add(Me.CurvedGrade_Label)
        Me.Controls.Add(Me.Orginal_Label)
        Me.Controls.Add(Me.Exit_Button)
        Me.Controls.Add(Me.Print_Button)
        Me.Controls.Add(Me.Statistic_GroupBox)
        Me.Controls.Add(Me.StudentName_ComboBox)
        Me.Controls.Add(Me.Author_Label)
        Me.Controls.Add(Me.MenuStrip1)
        Me.MainMenuStrip = Me.MenuStrip1
        Me.Name = "Main_Form"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Video Bonanza"
        Me.MenuStrip1.ResumeLayout(False)
        Me.MenuStrip1.PerformLayout()
        Me.Statistic_GroupBox.ResumeLayout(False)
        Me.Statistic_GroupBox.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents MenuStrip1 As System.Windows.Forms.MenuStrip
    Friend WithEvents File_ToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents FileOpen_ToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents ToolStripMenuItem1 As System.Windows.Forms.ToolStripSeparator
    Friend WithEvents FileExit_ToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents Help_ToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents HelpAbout_ToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents Author_Label As System.Windows.Forms.Label
    Friend WithEvents StudentName_ComboBox As System.Windows.Forms.ComboBox
    Friend WithEvents Statistic_GroupBox As System.Windows.Forms.GroupBox
    Friend WithEvents Curved_Label As System.Windows.Forms.Label
    Friend WithEvents STDStat_TextBox As System.Windows.Forms.TextBox
    Friend WithEvents Grade_Label As System.Windows.Forms.Label
    Friend WithEvents Mean_Label As System.Windows.Forms.Label
    Friend WithEvents MeanGradeStat_TextBox As System.Windows.Forms.TextBox
    Friend WithEvents NumGradeStat_TextBox As System.Windows.Forms.TextBox
    Friend WithEvents Print_Button As System.Windows.Forms.Button
    Friend WithEvents Exit_Button As System.Windows.Forms.Button
    Friend WithEvents PrintForm1 As Microsoft.VisualBasic.PowerPacks.Printing.PrintForm
    Friend WithEvents OpenFileDialog1 As System.Windows.Forms.OpenFileDialog
    Friend WithEvents CurvedGrade_Label As System.Windows.Forms.Label
    Friend WithEvents Orginal_Label As System.Windows.Forms.Label
    Friend WithEvents CurvedGrade_TextBox As System.Windows.Forms.TextBox
    Friend WithEvents OriginalScore_TextBox As System.Windows.Forms.TextBox
    Friend WithEvents ToolTip1 As System.Windows.Forms.ToolTip

End Class
